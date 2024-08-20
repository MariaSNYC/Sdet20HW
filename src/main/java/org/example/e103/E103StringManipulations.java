package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string");
        String input=scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i)+" ");

        }

    }
}
