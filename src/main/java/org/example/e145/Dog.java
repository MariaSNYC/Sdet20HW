package org.example.e145;

public class Dog {
    private String dogName;
    private double dogWeight;
    private static String dogBreed="Mutt";

    Dog(String dogName, double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;
    }
    public void displayDetails(){
        System.out.println(this.dogName+" "+this.dogBreed+" "+this.dogWeight);
    }
}
