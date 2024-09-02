package org.example.e158;

public class E158MethodOverloading {
    public static void main(String[] args){
        LoanPaymentCalculator lpc=new LoanPaymentCalculator();
        double result1=lpc.calculatePayment(10000,5);
            System.out.println(result1);

            double result2=lpc.calculatePayment(10000,5,24);
        System.out.println(result2);

        double result3=lpc.calculatePayment(10000,5,24,2000);
        System.out.println(result3);

            }


    }


