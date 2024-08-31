package org.example.e126;

public class E126Variables {
    // Declare a static variable at the class level to hold the count of all instances of the class
    static int instanceCount = 0;

    // Constructor to increment the count
    public E126Variables() {
        instanceCount++;
    }

    public static void main(String[] args) {
        E126Variables obj1=new E126Variables();
        E126Variables obj2=new E126Variables();
        E126Variables obj3=new E126Variables();

        System.out.println(E126Variables.instanceCount);

        // Create 3 objects of the class

        // Print the value of the count variable
    }
}
