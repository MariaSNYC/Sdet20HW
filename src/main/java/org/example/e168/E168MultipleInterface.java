package org.example.e168;

public class E168MultipleInterface {

    public static void main(String[] args){
        BankAccount bankAccount=new BankAccount(100.0);
        bankAccount.deposit(100.0);
        bankAccount.withdraw(50.0);
        bankAccount.checkBalance();
        bankAccount.withdraw(100.0);


    }
}
