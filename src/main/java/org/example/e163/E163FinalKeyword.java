package org.example.e163;

public class E163FinalKeyword {

    public static void main(String[] args){
        StringManipulator stringManipulator=new StringManipulator("hello");
        System.out.println(stringManipulator.reverseString());

        ArrayManipulator arrayManipulator=new ArrayManipulator();
        int[]numbers={3,4,5,6,6};
        System.out.println(arrayManipulator.avgElements(numbers));


    }

}
