package org.example.e32;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);


        System.out.println("Please enter your gender: M or F");
        char gender=input.next().charAt(0);

        System.out.println("Please enter your age");
        int age=input.nextInt();

       if (age>25){
           if (gender=='F'){
           System.out.println("Woman");}else{
               System.out.println("Man");
           }
       } else if (age<=25) {
           if (gender=='F'){
               System.out.println("Girl");
           }else {
               System.out.println("Boy");
           }

       }

        // Classify based on gender and age
        // If age is above 25
        //    If gender is "F", print "Woman"
        //    Otherwise, print "Man"
        // If age is 25 or below
        //    If gender is "F", print "Girl"
        //    Otherwise, print "Boy"
    }
}
