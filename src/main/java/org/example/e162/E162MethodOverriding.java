package org.example.e162;

public class E162MethodOverriding {
    public static void main(String[] args) {
        Animal[]animals={new Cat(),new Kitten1(),new Kitten2(),new Kitten3()};
        for (Animal a:animals){
            a.eat();
            a.sleep();
        }
        Cat c=new Cat();
        c.makeSound();

    }
}
