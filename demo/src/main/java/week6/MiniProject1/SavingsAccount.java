package week6.MiniProject1;
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(accountHolder + " earned interest: $" + String.format("%.2f", interest));
    }

    @Override
    public String getType() {
        return "Savings";
    }

    @Override
    public double getExtra() {
        return interestRate;
    }
}
