package org.example.e134;

public class E134StaticKeyword {

    public  static int countVowels(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (c=='a'|| c=='o'||c=='e'||c=='u'||c=='i'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countVowels("obama"));
        System.out.println(countVowels("happy friday! i love weekends"));


    }
}

