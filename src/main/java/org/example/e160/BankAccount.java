package org.example.e160;

public class BankAccount {
    private void displayInfo(){
        System.out.println("private displayInfo method");
    }

    private void displayInfo(int balance){
        System.out.println("private displayInfo method with balance: "+balance);
    }

    public static void displayBankInfo(){
        System.out.println("static method without parameter");

    }
    public static void displayBankInfo(int branches){
        System.out.println("static method with int parameter: "+branches);
    }

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.displayInfo();
        ba.displayInfo(5000);
        BankAccount.displayBankInfo();
        BankAccount.displayBankInfo(20);
    }


}
