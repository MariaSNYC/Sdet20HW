package org.example.e140;

public class E140AccessModifiers {

    static String maxLength(String[]words){
        if (words==null ||words.length==0){
            return "";
        }
        String longestWord=words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;

    }

    public static void main(String[] args) {
        String []words={"this","is","longest"};
        System.out.println(maxLength(words));
    }
}
