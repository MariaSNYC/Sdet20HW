package org.example.e127;

public class E127StaticKeyword {

    public static void main(String[] args) {

       E127StaticKeyword obj=new E127StaticKeyword();
       obj.nonStatic();
       Statics();
    }
    public void nonStatic(){
        System.out.println("Programming is amazing.");
    }
    public static void Statics(){
        System.out.println("Java is awesome.");
    }

    // Create a non-static method to print "Programming is amazing."

    // Create a static method to print "Java is awesome."
}
