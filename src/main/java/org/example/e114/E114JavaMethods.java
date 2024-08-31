package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        E114JavaMethods calling=new E114JavaMethods();

        // Call the add method with arguments that add up to 30
        calling.addition(10,20);
        calling.multiply(3,10);
        calling.subtract(30,10);

        // Call the multiply method with arguments that multiply to 30

        // Call the subtract method with arguments that subtract to 20

    }
    void multiply(int a,int b){
        System.out.println("Multiplication "+a*b);
    }
    void addition(int a,int b){
        System.out.println("Addition "+(a+b));
    }
    void subtract(int a,int b){
        System.out.println("Substraction "+(a-b));
    }

    // Create method multiply with two integer parameters and a print statement to display the result

    // Create method add with two integer parameters and a print statement to display the result

    // Create method subtract with two integer parameters and a print statement to display the result

}
