package inventorymanagementsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Product class represents one product in the inventory system.
 * It stores product details and updates reorder status automatically.
 */

public class Product {

    private String code;
    private String description;
    private LocalDate inDate;
    private int quantityOnHand;
    private int minimumStock;
    private double price;
    private int reorderIndicator; // 1 = reorder needed, 0 = enough stock

    // Constructor to create a product object.
    public Product(String code, String description, LocalDate inDate,
                   int quantityOnHand, int minimumStock, double price) {
        this.code = code;
        this.description = description;
        this.inDate = inDate;
        this.quantityOnHand = quantityOnHand;
        this.minimumStock = minimumStock;
        this.price = price;
        this.reorderIndicator = 0;
        updateReorderIndicator();
    }

    // Getter methods
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getInDate() {
        return inDate;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public int getMinimumStock() {
        return minimumStock;
    }

    public double getPrice() {
        return price;
    }

    public int getReorderIndicator() {
        return reorderIndicator;
    }

    // Updates quantity on hand and refreshes reorder status.
    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
        updateReorderIndicator();
    }

    // Adds an amount to the current quantity and refreshes reorder status.
    public void addToQuantity(int amount) {
        this.quantityOnHand += amount;
        updateReorderIndicator();
    }

    // Sets reorder indicator based on current stock level.
    public void updateReorderIndicator() {
        if (quantityOnHand <= minimumStock) {
            reorderIndicator = 1;
        } else {
            reorderIndicator = 0;
        }
    }

    // Returns product data in file format.
    public String toFileString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return code + "," + description + "," + inDate.format(formatter) + ","
                + quantityOnHand + "," + minimumStock + "," + price + "," + reorderIndicator;
    }

    // Returns product data in a readable console format.
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Code: " + code
                + " | Description: " + description
                + " | In-Date: " + inDate.format(formatter)
                + " | Qty: " + quantityOnHand
                + " | Min Stock: " + minimumStock
                + " | Price: $" + String.format("%.2f", price)
                + " | Reorder: " + reorderIndicator;
    }
}