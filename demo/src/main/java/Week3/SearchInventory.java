package Week3;
import java.io.*;
import java.util.*;

public class SearchInventory {

    public static void main(String[] args) {
        List<Product> inventory = getInventory();

        if (inventory.isEmpty()) {
            System.out.println("No products found in inventory.");
            return;
        }

        inventory.sort(Comparator.comparing(Product::getName));
        System.out.println("Full Product Inventory:");
        inventory.forEach(System.out::println);
    }

    public static List<Product> getInventory() {
        return Arrays.asList(
                new Product(101, "Hammer", 15.99f),
                new Product(102, "Box of nails", 9.29f),
                new Product(103, "Measuring Tape", 11.75f),
                new Product(104, "Screwdriver", 5.49f),
                new Product(105, "2x4 Lumber", 9.99f)
        );
    }

    public static List<Product> loadInventoryFromFile(String filename) {
        List<Product> inventory = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    try {
                        inventory.add(new Product(Integer.parseInt(parts[0].trim()), parts[1].trim(), Float.parseFloat(parts[2].trim())));
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid line: " + line);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return inventory;
    }
}


//MapMiniExercise.java