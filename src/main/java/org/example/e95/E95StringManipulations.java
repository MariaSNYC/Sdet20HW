package org.example.e95;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);
        String value= scanner.nextLine();

        value.substring(0,3);
        System.out.println("The first three letters of "+value+" are "+value.substring(0,3));
        // Extract the first 3 letters using the substring() method

        // Print the result in the specified format
    }
}
