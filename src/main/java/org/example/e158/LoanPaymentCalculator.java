package org.example.e158;

public class LoanPaymentCalculator {
    public double calculatePayment(double loanAmount,double interestRate){
        double payment = (loanAmount * (1 + interestRate/100)/12);
        return payment;
    }

    public double calculatePayment(double loanAmount,double interestRate,int numberOfMonths){
        double payment=(loanAmount * (1 + interestRate/100)/numberOfMonths);
        return payment;
        }
        public double calculatePayment(double loanAmount,double interestRate,int numberOfMonths,double downPayment){
            double payment = ((loanAmount - downPayment) * (1 + interestRate/100)/numberOfMonths);
            return payment;
        }


    }


