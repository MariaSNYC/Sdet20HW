package org.example.e119;

public class E119JavaMethods {
    public static String sensorLetter(String str,char ch){
        return str.replace(ch,'*');
    }
    public static void main(String[] args) {
        System.out.println(sensorLetter("computer science",'e'));
        System.out.println(sensorLetter("trick or treat",'t'));
        // Students will write the code here.
    }

}
