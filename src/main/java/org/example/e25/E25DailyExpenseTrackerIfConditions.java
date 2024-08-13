package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        int morningExpense=15;
        int afternoonExpense=25;
        int eveningExpense=45;


        // Calculate total expense
        int totalExpense=morningExpense+afternoonExpense+eveningExpense;
        System.out.println("Your total daily expense is "+totalExpense+".");


        // Define a budget
        int budget=100;



        // Check if within budget
        if (totalExpense<=budget){
            System.out.println("You are within the budget.");
        }else{
            System.out.println("You are not within the budget.");
        }


    }
}
