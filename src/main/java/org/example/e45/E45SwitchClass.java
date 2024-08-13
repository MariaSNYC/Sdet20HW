package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        int coffeeType= scan.nextInt();
        int price=0;
        switch (coffeeType){
            case 1:
                price=3;
                System.out.println("The price of your coffee is $"+price);
                break;
            case 2:
                price=4;
                System.out.println("The price of your coffee is $"+price);
                break;
            case 3:
                price=4;
                System.out.println("The price of your coffee is $"+price);
                break;
            case 4:
                price=5;
                System.out.println("The price of your coffee is $"+price);
                break;
            default:
                System.out.println("Invalid coffee type entered");
                break;
        }


    }
}
