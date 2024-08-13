package org.example.e40;

import java.util.Scanner;
import java.util.SortedMap;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter the name of the instructor
        // Capture the instructor name input
        System.out.println("Enter name of the instructor");
        String instructorName= input.next();
        String responsibility="xyz";


        // Determine the responsibility based on the instructor's name using a switch statement
        switch (instructorName){
            case "Ashgar":
                responsibility="Will take care of Java Assignments.";
                break;
            case "Moazzam":
                responsibility="Will take care of SDLC Assignment";
                break;
            case "Weqas":
                    responsibility="Will take care of Selenium Assignment";
                    break;
            case "Asel":
                responsibility="Will take care of every Assignment";
                break;
            default:
                responsibility="Invalid instructor selected";
                break;
        }
        // Print the responsibility
        System.out.println(instructorName+" "+responsibility);



    }
}
