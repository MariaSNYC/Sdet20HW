package org.example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {
        E115JavaMethods calling=new E115JavaMethods();
        calling.convertToUpper();
        // Call the convertToUpper method and print the result
    }
    void convertToUpper(){
        String s="Test";
        System.out.println(s.toUpperCase());




    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
}
