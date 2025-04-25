package week2;

public class ProductParser {
    public static void main(String[] args) {
        String input = "111|Hot Chocolate (12-count)|21|4.99";
        String[] parts = input.split("\\|");

        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int quantity = Integer.parseInt(parts[2]);
        double price = Double.parseDouble(parts[3]);

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}

