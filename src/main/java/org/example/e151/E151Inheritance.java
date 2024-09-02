package org.example.e151;

public class E151Inheritance {
    public static void main(String[] args) {

            // Create a SavingsAccount object
            SavingsAccount savings = new SavingsAccount("John Doe", 123456789, 1000, 5);
            savings.printAccountInfo();
            savings.Deposit(200);
            savings.applyInterest();
            savings.printAccountInfo();

            System.out.println();

            // Create a CheckingAccount object
            CheckingAccount checking = new CheckingAccount("Jane Smith", 987654321, 500, 100);
            checking.printAccountInfo();
            checking.withdraw(550);
            checking.printAccountInfo();
            checking.withdraw(100);
            checking.printAccountInfo();
        }

}

