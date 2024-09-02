package org.example.e157;

public class E157MethodOverloading {


    public static void main(String[] args) {
        TransactionCalculator calculator = new TransactionCalculator();


        int result1 = calculator.calculateProfit(100, 20, 30, 10);
        System.out.println(result1);


        int result2 = calculator.calculateProfit(80, 30, 20);
        System.out.println(result2);


        int result3 = calculator.calculateProfit(50, 30);
        System.out.println(result3);
    }

    }




