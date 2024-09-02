package org.example.e151;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountHolderName,int accountNumber,double balance,double interestRate){
        super(accountHolderName,accountNumber,balance);
        this.interestRate=interestRate;
    }

        public void applyInterest(){
            double interest=getBalance()*interestRate/100;
            Deposit(interest);
            System.out.println("Interest applied: " + interest);

        }

}
