package week6.MiniProject1;
import java.io.*;
import java.util.*;

public class BankAccountManager {
    static final String FILE_PATH = "accounts.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        loadAccountsFromCSV();

        System.out.println("========================================");
        System.out.println("Welcome to the Bank Account Manager App!");
        System.out.println("========================================");

        while (true) {
            System.out.println("\nMenu:");

            System.out.printf("%-5s %s%n", "S)", "Create Savings Account");
            System.out.printf("%-5s %s%n", "C)", "Create Checking Account");
            System.out.printf("%-5s %s%n", "L)", "List All Accounts");
            System.out.printf("%-5s %s%n", "B)", "Show Balances");
            System.out.printf("%-5s %s%n", "X)", "Exit");
            System.out.print("Enter your choice: ");


            String choice = scanner.nextLine().trim().toUpperCase();

            switch (choice) {
                case "S": createSavingsAccount(); break;
                case "C": createCheckingAccount(); break;
                case "L": listAccounts(); break;
                case "B": showBalances(); break;
                case "X":
                    saveAccountsToCSV();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try S, C, L, B, or X.");
            }
        }
    }

    static void createSavingsAccount() {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter starting balance: ");
        double balance = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter interest rate (e.g. 0.05): ");
        double rate = Double.parseDouble(scanner.nextLine());

        accounts.add(new SavingsAccount(name, balance, rate));
        System.out.println("Savings account created for " + name);
    }

    static void createCheckingAccount() {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter starting balance: ");
        double balance = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter transaction fee (e.g. 2.5): ");
        double fee = Double.parseDouble(scanner.nextLine());

        accounts.add(new CheckingAccount(name, balance, fee));
        System.out.println("Checking account created for " + name);
    }

    static void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        for (BankAccount acc : accounts) {
            acc.printSummary();
        }
    }

    static void showBalances() {
        double total = 0;
        for (BankAccount acc : accounts) {
            total += acc.balance;
        }

        System.out.println("Total number of accounts: " + accounts.size());
        System.out.println("Total balance across all accounts: $" + String.format("%.2f", total));
    }

    static void loadAccountsFromCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 4) continue;

                String type = parts[0];
                String name = parts[1];
                double balance = Double.parseDouble(parts[2]);
                double extra = Double.parseDouble(parts[3]);

                if (type.equalsIgnoreCase("Savings")) {
                    accounts.add(new SavingsAccount(name, balance, extra));
                } else if (type.equalsIgnoreCase("Checking")) {
                    accounts.add(new CheckingAccount(name, balance, extra));
                }
            }
        } catch (IOException e) {
            System.out.println("No existing CSV found. Starting fresh.");
        }
    }

    static void saveAccountsToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (BankAccount acc : accounts) {
                writer.write(acc.toCSV());
                writer.newLine();
            }
            System.out.println("Accounts saved to " + FILE_PATH);
        } catch (IOException e) {
            System.err.println("Error writing CSV: " + e.getMessage());
        }
    }
}
