package org.example.e152;

public class Building {
    private String location;

    public Building(String location){
        this.location=location;
        System.out.println(location);
    }
    public Building(){
        System.out.println("Building Constructor");
    }
}
