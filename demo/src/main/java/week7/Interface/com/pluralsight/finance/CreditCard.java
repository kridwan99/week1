package week7.Interface.com.pluralsight.finance;



import week7.Interface.com.pluralsight.Valuable;

public class CreditCard implements Valuable {
    private String name;
    private int accountNumber;
    private double balance;

    public CreditCard(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return -balance; // Credit card balance is a liability
    }
}

