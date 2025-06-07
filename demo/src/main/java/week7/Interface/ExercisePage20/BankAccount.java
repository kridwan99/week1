package week7.Interface.ExercisePage20;

// Class representing a bank account (liquid asset)
public class BankAccount implements Valuable {
    private String bankName;   // Name of the bank
    private double balance;    // Current balance in the account

    // Constructor sets the bank name and starting balance
    public BankAccount(String bankName, double initialBalance) {
        this.bankName = bankName;
        this.balance = initialBalance;
    }

    // Deposits money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraws money from the account if sufficient funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Getter for bank name
    public String getBankName() {
        return bankName;
    }

    // Getter for current balance
    public double getBalance() {
        return balance;
    }

    // Returns the current balance as the value of the account
    @Override
    public double getValue() {
        return balance;
    }
}
