package org.example.e156;

public class Dog extends Animal{
    String sound="Bark";

    public void displaySound(){
        System.out.println(sound);
        System.out.println(super.sound);

    }
}
