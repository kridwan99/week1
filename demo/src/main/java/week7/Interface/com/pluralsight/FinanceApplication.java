package week7.Interface.com.pluralsight;


import week7.Interface.com.pluralsight.finance.BankAccount;


public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        account1.deposit(100);


        System.out.println("Account1 Value: " + account1.getValue());
        System.out.println("Account2 Value: " + account2.getValue());
    }
}

