package org.example.e165;

public class E165InterfaceClass {

    public static void main(String[] args) {
        ElectronicDevice smartphone=new Smartphone();
        smartphone.turnOn();
        smartphone.turnOff();

        ElectronicDevice laptop=new Laptop();

        laptop.turnOn();
        laptop.turnOff();



    }

}