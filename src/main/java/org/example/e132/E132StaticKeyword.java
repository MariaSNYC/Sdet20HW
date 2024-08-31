package org.example.e132;

public class E132StaticKeyword {
    public  static double [][]reduce10(double[][]nums){

        double[][] result = new double[nums.length][nums[0].length];

        // Iterate through the array to subtract 10 from each element
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[i][j] = nums[i][j] - 10;
            }
        }

        return result;  // Return the new array
    }

    public static void main(String[] args) {
        // Example input 2D array
        double[][] nums = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };

        // Call the reduce10 method and get the new array
        double[][] reducedArray = reduce10(nums);

        // Print the values of the new array in the specified format
        for (int i = 0; i < reducedArray.length; i++) {
            for (int j = 0; j < reducedArray[i].length; j++) {
                System.out.print((int)reducedArray[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }


    }

