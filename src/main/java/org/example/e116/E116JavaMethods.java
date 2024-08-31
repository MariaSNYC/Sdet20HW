package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        E116JavaMethods calling=new E116JavaMethods();
        calling.bothEven(4,8);

        // Call the bothEven method with various arguments to test the method
    }

    void bothEven(int c,int n){
        if (c%2==0 && n%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    // Create method bothEven with two integer parameters
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
}
