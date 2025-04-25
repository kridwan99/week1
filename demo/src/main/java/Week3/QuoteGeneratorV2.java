package Week3;

import java.io.*;
import java.util.*;

public class QuoteGeneratorV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("[1] Show all quotes");
            System.out.println("[2] Show a random quote");
            System.out.println("[3] Add a new quote");
            System.out.println("[4] Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showAllQuotes();
                    break;
                case "2":
                    showRandomQuote();
                    break;
                case "3":
                    addNewQuote(scanner);
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void showAllQuotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"))) {
            String line;
            System.out.println("\n--- All Quotes ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Could not read quotes.");
        }
    }

    private static void showRandomQuote() {
        List<String> quotes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                quotes.add(line);
            }
        } catch (IOException e) {
            System.out.println("Could not read quotes.");
            return;
        }

        if (quotes.isEmpty()) {
            System.out.println("No quotes available.");
        } else {
            Random random = new Random();
            String quote = quotes.get(random.nextInt(quotes.size()));
            System.out.println("\nRandom Quote: " + quote);
        }
    }

    private static void addNewQuote(Scanner scanner) {
        System.out.print("Enter your new quote: ");
        String quote = scanner.nextLine();

        try (FileWriter writer = new FileWriter("quotes.txt", true)) {
            writer.write(quote + "\n");
            System.out.println("Quote added!");
        } catch (IOException e) {
            System.out.println("Could not write quote.");
        }
    }
}
