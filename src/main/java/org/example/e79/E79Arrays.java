package org.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int[] rowsums=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                rowsums[i]+=a[i][j];
            }

        }
        for (int sum:rowsums){
            System.out.println(sum);
        }

        }

        // Declare an array to store the sums of each row

        // Use nested loops to iterate through the 2D array and calculate the sum of each row

        // Store the sums in the new array

        // Print the values of the new array
    }

