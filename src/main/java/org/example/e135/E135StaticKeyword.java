package org.example.e135;

public class E135StaticKeyword {
    public static String surround(String s,String search_term){
        String result = s.replace(search_term, "(" + search_term + ")");
        return result;
    }

  
    public static void main(String[] args) {
        System.out.println(surround("ahdcvjacscv","c"));
        System.out.println(surround("technology","o"));

    }
}

