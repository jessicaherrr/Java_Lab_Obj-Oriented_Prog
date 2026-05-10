package inventorymanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * InventoryManagement class contains all inventory operations.
 * It handles loading, adding, searching, updating, alerts, and reports.
 */

public class InventoryManagement {

    private static final ArrayList<Product> inventory = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // Displays the main menu.
    public static void displayMenu() {
        System.out.println("--- Inventory Management System ---");
        System.out.println("1. Load Products from File");
        System.out.println("2. Add a New Product");
        System.out.println("3. Update Product Quantity");
        System.out.println("4. Search Products");
        System.out.println("5. Custom Function 1 - Display Low Stock Alerts");
        System.out.println("6. Custom Function 2 - Calculate Total Inventory Value");
        System.out.println("7. Generate Inventory Report");
        System.out.println("8. Exit");
    }

    // Loads products from a text file using a relative path.
    public static void loadProductsFromFile() {
        System.out.print("Enter the file name to load products: ");
        String fileName = scanner.nextLine();
        int loadedCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                if (parts.length < 6) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }

                String code = parts[0].trim();
                String description = parts[1].trim();
                LocalDate inDate = LocalDate.parse(parts[2].trim(), formatter);
                int quantity = Integer.parseInt(parts[3].trim());
                int minimumStock = Integer.parseInt(parts[4].trim());
                double price = Double.parseDouble(parts[5].trim());

                // Avoid duplicate product codes
                if (findProductByCode(code) == null) {
                    Product product = new Product(code, description, inDate, quantity, minimumStock, price);
                    inventory.add(product);
                    loadedCount++;
                } else {
                    System.out.println("Duplicate code skipped: " + code);
                }
            }

            System.out.println(loadedCount + " product(s) loaded successfully.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (DateTimeParseException | NumberFormatException e) {
            System.out.println("Error parsing file data: " + e.getMessage());
        }
    }

    // Adds a new product to the inventory.
    public static void addNewProduct() {
        System.out.print("Enter product code: ");
        String code = scanner.nextLine().trim();

        if (findProductByCode(code) != null) {
            System.out.println("A product with this code already exists.");
            return;
        }

        System.out.print("Enter product description: ");
        String description = scanner.nextLine().trim();
        LocalDate inDate = readDate("Enter product in-date (yyyy-MM-dd): ");
        int quantity = readInt("Enter quantity on hand: ");
        int minimumStock = readInt("Enter minimum stock: ");
        double price = readDouble("Enter price: ");

        Product product = new Product(code, description, inDate, quantity, minimumStock, price);
        inventory.add(product);
        System.out.println("Product added successfully.");
    }

    // Updates the quantity on hand for an existing product.
    public static void updateProductQuantity() {
        System.out.print("Enter product code to update: ");
        String code = scanner.nextLine().trim();
        Product product = findProductByCode(code);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        System.out.println("Current product: " + product);
        int newQuantity = readInt("Enter new quantity on hand: ");
        product.setQuantityOnHand(newQuantity);
        System.out.println("Quantity updated successfully.");
    }

    // Searches products by code or description.
    public static void searchProducts() {
        System.out.print("Enter product code or description to search: ");
        String keyword = scanner.nextLine().trim().toLowerCase();
        boolean found = false;

        for (Product product : inventory) {
            if (product.getCode().toLowerCase().contains(keyword)
                    || product.getDescription().toLowerCase().contains(keyword)) {
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching products found.");
        }
    }

    /**
     * Custom Function 1:
     * Displays products that are at or below minimum stock level.
     */
    public static void displayLowStockProducts() {
        boolean found = false;
        System.out.println("--- Low Stock Alert Report ---");

        for (Product product : inventory) {
            if (product.getQuantityOnHand() <= product.getMinimumStock()) {
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No low-stock products at this time.");
        }
    }

    /**
     * Custom Function 2:
     * Calculates and displays the total inventory value.
     */
    public static void calculateInventoryValue() {
        double totalValue = 0.0;

        for (Product product : inventory) {
            totalValue += product.getQuantityOnHand() * product.getPrice();
        }

        System.out.printf("Total inventory value: $%.2f%n", totalValue);
    }

    // Generates an inventory report and saves it to a text file.
    public static void generateInventoryReport() {
        System.out.print("Enter output file name for report: ");
        String outputFileName = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            writer.write("Inventory Report");
            writer.newLine();
            writer.newLine();

            for (Product product : inventory) {
                writer.write(product.toString());
                writer.newLine();
            }

            System.out.println("Inventory report generated successfully in file: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Error writing report: " + e.getMessage());
        }
    }

    // Finds a product by its code.
    public static Product findProductByCode(String code) {
        for (Product product : inventory) {
            if (product.getCode().equalsIgnoreCase(code)) {
                return product;
            }
        }
        return null;
    }

    // Reads an integer safely from user input.
    public static int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Please try again.");
            }
        }
    }

    // Reads a double safely from user input.
    public static double readDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }

    // Reads a LocalDate safely from user input.
    public static LocalDate readDate(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return LocalDate.parse(scanner.nextLine().trim(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Use yyyy-MM-dd.");
            }
        }
    }
}