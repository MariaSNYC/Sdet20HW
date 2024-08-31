package org.example.e122;

public class E122Variables {
    String nameOfTheCountry;
    String capital;
    int populationSize;
    // Declare 3 instance variables: name of the country, capital, and population size

    // Create a method to display values of instance variables

    public static void main(String[] args) {
        E122Variables first=new E122Variables();
        first.nameOfTheCountry="USA";
        first.capital="Washington DC";
        first.populationSize=330000000;


        E122Variables second= new E122Variables();
        second.nameOfTheCountry="Kazakhstan";
        second.capital="Astana";
        second.populationSize=18500000;

        System.out.println("The capital of "+first.nameOfTheCountry+" is "+first.capital+" and population is "+first.populationSize);
        System.out.println("The capital of "+second.nameOfTheCountry+" is "+second.capital+" and population is "+second.populationSize);
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance
    }
}
