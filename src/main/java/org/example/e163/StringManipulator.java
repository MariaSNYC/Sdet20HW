package org.example.e163;

public class StringManipulator {
    private String str;
    public StringManipulator(String str){
        this.str=str;
    }
    public final String reverseString(){
        StringBuilder reversed=new StringBuilder(str);
            return reversed.reverse().toString();

    }
}
