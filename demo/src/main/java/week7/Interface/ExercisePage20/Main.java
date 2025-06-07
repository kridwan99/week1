package week7.Interface.ExercisePage20;
public class Main {
    public static void main(String[] args) {
        // Create a new portfolio
        Portfolio portfolio = new Portfolio("My Portfolio", "Ridwan");

        // Add fixed assets
        Jewelry necklace = new Jewelry("Maaike", 24);
        Gold goldBar = new Gold("Gold Bar", 10);
        House house = new House("Family House", 300000, 2010, 2000, 4);

        // Add liquid assets (bank account)
        BankAccount bankAccount = new BankAccount("Wells Fargo", 10000);
        bankAccount.deposit(2000);       // Add funds
        bankAccount.withdraw(1500);      // Withdraw funds

        // Add debt (credit card)
        CreditCard creditCard = new CreditCard("MasterCard", 3000);
        creditCard.charge(500);          // Add debt
        creditCard.pay(800);             // Reduce debt

        // Add all items to the portfolio
        portfolio.add(necklace);
        portfolio.add(goldBar);
        portfolio.add(house);
        portfolio.add(bankAccount);
        portfolio.add(creditCard);

        // Print the total net worth
       // System.out.println("Total Net Worth: $" + portfolio.getValue());

        // Print breakdown of all assets
        portfolio.printBreakdown();


    }
}
