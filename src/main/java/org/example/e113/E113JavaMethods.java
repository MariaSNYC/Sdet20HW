package org.example.e113;

public class E113JavaMethods {
    public static void main(String[] args) {
        // Call method printTime with arguments 11 and 30
        E113JavaMethods calling=new E113JavaMethods();
        calling.printTime(11,30);

    }
    void printTime(int hours, int minutes){
        System.out.println(hours+":"+minutes);
    }

    // Create method printTime with two integer parameters (hours and minutes)
    // and a print statement to display the time

}
