package org.example.e154;

public class WashingMachine extends Appliance{
    public WashingMachine(){
        System.out.println("WashingMachine Constructor without argument");
    }

    private int capacity;
    public WashingMachine(int wattage, int capacity){
        super(wattage);
        System.out.println("Capacity "+capacity);
    }
}
