package week6.ProductShopping;

// ShoppingCartApp.java
// This class contains the main method to run the shopping cart system.

public class ShoppingCartApp {
    public static void main(String[] args) {
        // Create a new shopping cart.
        ShoppingCart cart = new ShoppingCart();

        // Add regular and discounted products to the cart.
        cart.addItem(new Product("Notebook", 12.99)); // Regular product (no discount).
        cart.addItem(new DiscountedProduct("Headphones", 49.99, 10)); // Discounted product (10% off).
        cart.addItem(new DiscountedProduct("Mouse", 25.00, 20)); // Discounted product (20% off).
        cart.addItem(new Product("Pen", 1.50)); // Another regular product.

        // Print the full receipt showing items, tax, and totals.
        cart.printReceipt();
    }
}

