package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {

        System.out.println("sumEvenToX(5)==>"+sumEvenToX(5));


        // Call the sumEvenToX method with various arguments to test the method
    }

    public static int sumEvenToX(int x){
        int sum=0;
        for (int i = 1; i <= x; i++) {
            if (i%2==0){
                 sum+=i;
            }
        }
        return sum;


    }

    // Create method sumEvenToX with an integer parameter (x)
    // Inside the method, calculate the sum of even integers from 1 to x
    // Return the calculated sum
}
