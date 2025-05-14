package week6.MiniProject1;
public class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for " + accountHolder);
        }
    }

    public void printSummary() {

            System.out.printf("%-15s | %-20s | Balance: $%.2f%n", getType(), accountHolder, balance);


        //System.out.println(getType() + " - " + accountHolder + ": $" + String.format("%.2f", balance));
    }

    public String getType() {
        return "Bank";
    }

    public double getExtra() {
        return 0.0;
    }

    public String toCSV() {
        return getType() + "," + accountHolder + "," + balance + "," + getExtra();
    }
}
