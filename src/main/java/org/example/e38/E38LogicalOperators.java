package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it weekend? true/false");
        boolean isWeekend= scanner.nextBoolean();
        System.out.println("Are you available? true/false");
        boolean isAvailable=scanner.nextBoolean();
        String subject="xyz";
        if (isWeekend && isAvailable){
            subject="Java";
        } else if (!isWeekend && isAvailable) {
             subject="Manual Testing";
        } else {
             subject="no subject";
        }
        System.out.println("Today you will be learning "+subject);
        scanner.close();

    }
}
