package week7.Interface.com.pluralsight.finance;

import week7.Interface.com.pluralsight.Valuable;

public class BankAccount implements Valuable {
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
