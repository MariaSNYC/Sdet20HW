package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string");
        String input=scanner.nextLine();
        String outcome=input.replaceAll(" ","");
        String out1=outcome.toLowerCase();
        System.out.println(out1);

        String reversedOutcome=new StringBuilder(out1).reverse().toString();
        boolean isPalindrome=out1.equals(reversedOutcome);
        System.out.println(isPalindrome);






        // Remove all spaces and convert the string to lowercase

        // Check if the string is a palindrome

        // Print "true" if the string is a palindrome, and "false" otherwise


        // Step 2: Create a Scanner object to read input from the console


    }
}
