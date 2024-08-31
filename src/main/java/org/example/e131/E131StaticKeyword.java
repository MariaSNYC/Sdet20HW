package org.example.e131;

public class E131StaticKeyword {

    public static String thirdLetter(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i+=3) {
            sb.append(s.charAt(i));
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(thirdLetter("Hello there"));
        System.out.println(thirdLetter("technology"));
    }
}
