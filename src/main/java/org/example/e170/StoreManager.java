package org.example.e170;

public class StoreManager {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.setCustomerName("Mario");
        c.setCustomerAge(32);

        String name=c.getCustomerName();
        int age=c.getCustomerAge();
        System.out.println("Customer name: "+name);
        System.out.println("Customer age "+age);
    }
}
