package Week3;

import java.util.Random;
import java.util.Scanner;

public class RandomQuoteGenerator {
    public static void main(String[] args) {

        // Assignment 3: Random Quote Generator
        String[] quotes = {
                "Be yourself; everyone else is already taken.",
                "The best way to get started is to quit talking and begin doing.",
                "Do what you can, with what you have, where you are.",
                "The only way to do great work is to love what you do.",
                "Believe you can and you're halfway there.",
                "The future belongs to those who prepare for it today.",
                "Keep your face always toward the sunshine—and shadows will fall behind you.",
                "Success is not how high you have climbed, but how you make a positive difference.",
                "Don't watch the clock; do what it does. Keep going.",
                "It always seems impossible until it's done."
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Random Quote Generator!");

        while (true) {
            System.out.print("\nPress Enter to see a quote or type 'exit' to stop: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            int index = random.nextInt(quotes.length);
            System.out.println("\nQuote: " + quotes[index]);
        }

        scanner.close();
    }
}
