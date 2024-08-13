package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        System.out.println ("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType= input.nextInt();
        int price=0;
        switch (mealType){
            case 1:
                price=5;
                break;
            case 2:
                price=10;
                break;
            case 3:
                price=15;
                break;
            default:
                System.out.println("Invalid meal type entered");
        }
        System.out.println("The price of your meal is $"+price);

    }
}
