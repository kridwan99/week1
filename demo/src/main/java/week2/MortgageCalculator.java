package week2;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
    }
    public static void run(Scanner scanner) {
        System.out.println("\n--- Mortgage Calculator ---");

        // Gather user input
        System.out.print("Enter loan amount (principal): $");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 7.625): ");
        double annualRate = scanner.nextDouble() / 100; // Convert % to decimal

        System.out.print("Enter loan term in years: ");
        int years = scanner.nextInt();

        // Calculations
        double monthlyRate = annualRate / 12;
        int numberOfPayments = years * 12;

        // Monthly Payment Formula
        double monthlyPayment = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        double totalPaid = monthlyPayment * numberOfPayments;
        double totalInterest = totalPaid - principal;

        // Display results
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Interest Paid Over Life of Loan: $%.2f%n", totalInterest);
        System.out.println("-----------------------------\n");
    }
}
