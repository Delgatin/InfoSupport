package first.lab7;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

    ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public void transfer(BankAccount from, BankAccount to, double amount) {
        try {
            from.withdraw(amount);
            to.deposit(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Transactions afgebroken: " + e.getMessage());
        }
    }

    public void createBankAccount(String nummer, BigDecimal balance, double interestRate) {
        bankAccounts.add(new BankAccount(nummer, balance, interestRate));
    }

    public double totalAmount() {
        BigDecimal som = BigDecimal.ZERO;
        for (BankAccount b : bankAccounts) {
            som = som.add(b.getBalance());
        }
        return som.doubleValue();
        
    }

    public void printAccountsInfo() {
        for (BankAccount b : bankAccounts) {
            System.out.println(b.toString());
        }
    }
}
