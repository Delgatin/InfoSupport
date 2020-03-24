package first.lab7;

import java.math.BigDecimal;

public class BankAccount {
    private String nummer;
    private BigDecimal balance;
    private double interestRate;

    public BankAccount(String number, BigDecimal balance, double interestRate) {
        this.nummer = number;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void withdraw (double amount) {
        if (balance.subtract(BigDecimal.valueOf(amount)).compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Balance too low.");
        }
        this.balance = this.balance.subtract(BigDecimal.valueOf(amount));
        //return amount;
    }

    public void deposit (double amount) {
        this.balance = this.balance.add(BigDecimal.valueOf(amount));
    }

    public BigDecimal calculateInterestRate() {
        return balance.multiply(BigDecimal.valueOf((interestRate / 100)));
    }

    @Override
    public String toString() {
        return "Account: " + nummer + " heeft: " + balance + " met interest van: " + calculateInterestRate();
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
