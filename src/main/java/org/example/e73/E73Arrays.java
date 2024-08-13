package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);
        int [] values=new int[5];

        for (int i = 0; i < values.length; i++){

            values[i]= scanner.nextInt();

        };
        for (int i = values.length-1; i < values.length; i--) {
            System.out.println(values[i]);

        }



        }




        // Create an array of integers that will store 5 elements


        // Use a loop to read 5 integers from the user and store them in the array
        // (Do not print any prompt message for the user)

        // Use another loop to iterate through the array in reverse order and print each value on a new line

    }

