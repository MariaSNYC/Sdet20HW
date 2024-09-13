package org.example.e168;

public class BankAccount implements BankOperations{
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }

    @Override
    public double deposit(double amount) {
        balance+=amount;
        processTransaction(amount);
        return balance;
    }
    public double withdraw(double amount){
       if (amount<=balance) {
           balance -= amount;
           processTransaction(-amount);
       }else {
           System.out.println("Transaction failed: Insufficient funds");
       }
       return balance;

    }

    @Override
    public double checkBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    @Override
    public void processTransaction(double amount) {
        if (amount >= 0) {
            System.out.println("Transaction successful: Deposited " + amount);
        } else {
            System.out.println("Transaction successful: Withdrew " + (-amount));
        }
    }
}
