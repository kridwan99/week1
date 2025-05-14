package week6.MiniProject1;

public class CheckingAccount extends BankAccount {
    private double transactionFee;

    public CheckingAccount(String accountHolder, double balance, double transactionFee) {
        super(accountHolder, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amount) {
        double total = amount + transactionFee;
        if (total <= balance) {
            balance -= total;
        } else {
            System.out.println("Insufficient funds for " + accountHolder + " (with fee).");
        }
    }

    @Override
    public String getType() {
        return "Checking";
    }

    @Override
    public double getExtra() {
        return transactionFee;
    }
}
