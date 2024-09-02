package org.example.e151;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;


    public BankAccount(String accountHolderName, int accountNumber,double balance){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }

    public void Deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        }else {
            System.out.println("Deposit amount must be positive.");
        }

    }

    public void Withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
        }

        public void printAccountInfo(){
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;

    }

}

