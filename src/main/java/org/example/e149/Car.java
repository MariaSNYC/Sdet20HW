package org.example.e149;

public class Car extends Vehicle{
     private String model;

     public Car(String make,int year, String model){
         super(make,year);//call Vehicle constructor
         this.model=model;
     }



    public void displayCarInfo(){
         super.displayInfo();
        System.out.println(" Model: "+model);
    }
    
}
