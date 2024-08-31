package org.example.e110;

public class E110JavaMethods {
    public static void main(String[] args) {
        E110JavaMethods calling=new E110JavaMethods();

        // Call method newLine
        calling.newLine();

        // Call method displayLine
        calling.displayLine();

    }

    void newLine(){
        System.out.println("newLine method implementation");
    }
    void displayLine(){
        System.out.println("displayLine method implementation");
    }
}
