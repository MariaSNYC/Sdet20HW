package org.example.e164;

public abstract class Vehicle {
    public abstract void startEngine();

    public void stopEngine(){
        System.out.println("Vehicle engine stopped");
    }
}
