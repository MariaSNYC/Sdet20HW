package org.example.e172;

public class E172Encapsulation {
    public static void main(String[] args){
        Customer customer=new Customer(1234567890,"Sarah Connor","sarah.connor@example.com",15000.0);
        customer.getAccountNumber();
        System.out.println("Account Number: "+customer.getAccountNumber());
        customer.getFullName();
        System.out.println("Full name "+customer.getFullName());
        customer.getEmail();
        System.out.println("Email "+customer.getEmail());
        customer.getBalance();
        System.out.println("Account balance: "+customer.getBalance());

    }

}


