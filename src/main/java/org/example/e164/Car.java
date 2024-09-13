package org.example.e164;

public class Car extends Vehicle{
    public void startEngine(){
        System.out.println("Car engine started");
    }
    public void startEngine(String keyType) {
        System.out.println("Car engine started with " + keyType);
    }


}
