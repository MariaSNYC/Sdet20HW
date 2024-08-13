package org.example.e39;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter their mark
        // Capture the mark input
        System.out.println("Please enter your mark");
        int marks= input.nextInt();

        char grade='F';

        // Determine the grade based on the mark
        if (marks>=1 && marks<=25){
            grade='F';
        } else if (marks>=26 && marks<=45) {
            grade='E';
        } else if (marks>=46 && marks<=50) {
            grade='D';
        } else if (marks>=51 && marks<=60) {
            grade='C';
        } else if (marks>=61 && marks<=80) {
            grade='B';
        } else if (marks>80) {
            grade='A';
        } else {
            System.out.println("Please enter a valid mark");
        }

        System.out.println("Your grade is "+grade);
        input.close();

    }
}
