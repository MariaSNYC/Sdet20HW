package org.example.e121;

public class E121Variables {
     int a;
    double b;
     char c;
    // Declare 3 instance variables: integer, double, and char

    public static void main(String[] args) {
        E121Variables first=new E121Variables();
        first.a=10;
        first.b=10.23;
        first.c='a';

        E121Variables second=new E121Variables();
        second.a=100;
        second.b=100.23;
        second.c='s';

        System.out.println(first.a);
        System.out.println(first.b);
        System.out.println(first.c);

        System.out.println(second.a);
        System.out.println(second.b);
        System.out.println(second.c);

        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }
}
