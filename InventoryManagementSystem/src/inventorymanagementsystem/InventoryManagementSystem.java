package inventorymanagementsystem;

/**
 * This system uses an object-oriented design with separate classes for data (Product), logic (InventoryManagement), and user interaction (InventoryManagementSystem). 
 * It supports file input/output, menu-based navigation, and exception handling for reliability. 
 * Custom functions include low-stock alerts and total inventory value calculation.
 */

public class InventoryManagementSystem {

    public static void main(String[] args) {
        int choice;

        do {
            InventoryManagement.displayMenu();
            choice = InventoryManagement.readInt("Select an option (1-8): ");

            switch (choice) {
                case 1:
                    InventoryManagement.loadProductsFromFile();
                    break;
                case 2:
                    InventoryManagement.addNewProduct();
                    break;
                case 3:
                    InventoryManagement.updateProductQuantity();
                    break;
                case 4:
                    InventoryManagement.searchProducts();
                    break;
                case 5:
                    InventoryManagement.displayLowStockProducts();
                    break;
                case 6:
                    InventoryManagement.calculateInventoryValue();
                    break;
                case 7:
                    InventoryManagement.generateInventoryReport();
                    break;
                case 8:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1-8.");
            }

            System.out.println();

        } while (choice != 8);
    }
}