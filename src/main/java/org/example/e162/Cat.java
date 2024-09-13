package org.example.e162;


public class Cat extends Animal{
    public Cat(){
        super("Cat");
    }
    public  void eat(){
        System.out.println("Cat eats");
    }

    protected void sleep(){
        System.out.println("Cat sleeps a lot");
    }
    protected  void makeSound(){
        System.out.println("Cat makes sound");
    }


}
