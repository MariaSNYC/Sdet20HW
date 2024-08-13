package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        String operator="*";
        int num1=5;
        int num2=8;
        int result=num2*num1;

        // Perform the corresponding arithmetic operation
        if(operator.equals("+")){
            System.out.println("The sum is: "+result);
        } else if (operator.equals("-")) {
            System.out.println("The difference is "+result );

        } else if (operator.equals("*")) {
            System.out.println("The product is: "+result);

        } else if (operator.equals("/")) {
            System.out.println("the quotient is: "+result);

        } else {
            System.out.println("Invalid operator");
        }


        }

    }

