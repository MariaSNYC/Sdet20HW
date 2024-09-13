package org.example.e165;

public class Smartphone implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on");
    }
    public void turnOff() {
        System.out.println("Smartphone is turning off");
    }
}
