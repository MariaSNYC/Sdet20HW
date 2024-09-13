package org.example.e165;

public class Laptop implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on");

    }
    public void turnOff() {
        System.out.println("Laptop is turning off");

    }

}
