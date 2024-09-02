package org.example.e151;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountHolderName, int accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method to allow overdraft

    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            System.out.println(amount + " withdrawn. New balance: " + getBalance());
        } else {
            System.out.println("Exceeded overdraft limit.");
        }
    }
}
