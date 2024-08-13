package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);
        String [] days=new String[7];

        for (int i = 0; i < days.length; i++) {
            System.out.println("Please enter the days of the week starting with Sunday:");
            System.out.print("Day " + (i + 1) + ": ");
            days[i] = scanner.nextLine();
        }

        for (String day : days) {
            System.out.println("Days of the week you entered:");
            System.out.println(day);
        }






        // Create an array of strings with size 7


        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array

        // Use another loop to iterate through the array and print each value on a new line

        // Create a Scanner object to read input from the console



    }
}
