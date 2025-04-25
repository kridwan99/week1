package org.example;
import java.util.Scanner;

public class SandwichShop {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // prompt for size
            System.out.println("Welcome to the Sandwich Shop!");
            System.out.print("Choose your sandwich size (1 = Regular, 2 = Large): ");
            int sizeChoice = scanner.nextInt();

            double basePrice;

            if (sizeChoice == 1) {
                basePrice = 5.45;
            } else if (sizeChoice == 2) {
                basePrice = 8.95;
            } else {
                System.out.println("Invalid sandwich size. Please restart and choose 1 or 2.");
                scanner.close();
                return;
            }

            // Prompt for age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            double discount = 0.0;

            if (age <= 17) {
                discount = 0.10;
            } else if (age >= 65) {
                discount = 0.20;
            }

            double finalPrice = basePrice - (basePrice * discount);


            System.out.printf("Your sandwich costs: $%.2f%n", finalPrice);

            scanner.close();
        }
}

