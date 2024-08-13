package org.example.e70;

public class E70Arrays {
    public static void main(String[] args) {
        // Create an array of integers with size 11
        int[]years=new int[11];
        for (int i = 0; i < years.length; i++) {
            years[i]=2010+i;
            
        }
        System.out.println("Years from 2010 to 2020: ");
        for (int year : years) {
            System.out.println(year);


        }


        // Use a for loop to add the years from 2010 to 2020 to the array


        // Use another for loop to iterate through the array and print each value on a new line

        // Declare and initialize the array of integers with size 11

    }
}
