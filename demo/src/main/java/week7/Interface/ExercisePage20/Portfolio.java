package week7.Interface.ExercisePage20;

import java.util.ArrayList;

// Class that holds a collection of valuable assets/accounts
public class Portfolio {
    private String name;                // Name of the portfolio
    private String owner;               // Owner of the portfolio
    private ArrayList<Valuable> valuables;  // List of assets and accounts

    // Constructor initializes name, owner, and valuables list
    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    // Adds a valuable item to the portfolio
    public void add(Valuable item) {
        valuables.add(item);
    }

    // Calculates the total value of the portfolio
    public double getValue() {
        double total = 0;
        for (Valuable item : valuables) {
            total += item.getValue();
        }
        return total;
    }

    // Prints all assets with their individual values
    public void printBreakdown() {
        System.out.println("Portfolio Breakdown: All good");
        for (Valuable item : valuables) {
            String itemName;

            // Use instanceof to describe each asset type
            if (item instanceof BankAccount) {
                itemName = "BankAccount (" + ((BankAccount) item).getBankName() + ")";
            } else if (item instanceof CreditCard) {
                itemName = "CreditCard (" + ((CreditCard) item).getCompany() + ")";
            } else if (item instanceof Gold) {
                itemName = "Gold (" + ((Gold) item).getName() + ")";
            } else if (item instanceof Jewelry) {
                itemName = "Jewelry (" + ((Jewelry) item).getName() + ")";
            } else if (item instanceof House) {
                itemName = "House (" + ((House) item).getName() + ")";
            } else {
                itemName = "Unknown Item";
            }

            // Print asset name and value formatted
            System.out.printf("%-30s = $%.2f\n", itemName, item.getValue());
        }

        System.out.println("----------------------------------------");
        System.out.printf("TOTAL NET WORTH                 = $%.2f\n", getValue());
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for owner
    public String getOwner() {
        return owner;
    }
}
