package week7.Interface.ExercisePage20;

// Class representing a credit card (debt)
public class CreditCard implements Valuable {
    private String company;         // Credit card company name
    private double balanceOwed;     // Amount of money owed

    // Constructor sets the company and initial debt
    public CreditCard(String company, double initialOwed) {
        this.company = company;
        this.balanceOwed = initialOwed;
    }

    // Adds a charge to the credit card
    public void charge(double amount) {
        if (amount > 0) {
            balanceOwed += amount;
        }
    }

    // Pays down the credit card balance
    public void pay(double amount) {
        if (amount > 0) {
            balanceOwed -= amount;
        }
    }

    // Getter for company name
    public String getCompany() {
        return company;
    }

    // Getter for balance owed
    public double getBalanceOwed() {
        return balanceOwed;
    }



    // Value is negative because it’s a debt
    @Override
    public double getValue() {
        return -balanceOwed;
    }
}
