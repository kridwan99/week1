package week6.ProductShopping;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    // Method to print the receipt with formatted output
    public void printReceipt() {
        double totalBeforeTax = 0;

        System.out.println(" Receipt:");
        for (Product item : items) {
            double finalPrice = item.getFinalPrice();
            System.out.printf("- %-15s: $%6.2f%n", item.getName(), finalPrice);
            totalBeforeTax += finalPrice;
        }

        double tax = totalBeforeTax * 0.21;
        double totalAfterTax = totalBeforeTax + tax;

        // Divider line
        System.out.println("------------------------------");

        // Subtotal, Tax, Total
        System.out.printf("%-17s: $%6.2f%n", "Subtotal", totalBeforeTax);
        System.out.printf("%-17s: $%6.2f%n", "Tax (21%)", tax);
        System.out.printf("%-17s: $%6.2f%n", "Total", totalAfterTax);
    }
}
