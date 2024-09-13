package org.example.e162;

public class Animal {
    private String type;
    public Animal(String type){
        this.type=type;
    }
    public  void eat(){
        System.out.println("I am an animal eating");
    }

    protected void sleep(){
        System.out.println("I am an animal sleeping");
    }
    protected  void makeSound(){
        System.out.println("I am an animal making sound");
    }
    private void roam(){
        System.out.println("I am an animal roaming");
    }
}



