package org.example.e192;

import java.util.Map;
import java.util.TreeMap;

public class E192Map {
    public static void main(String[] args){
        TreeMap<String, String>productsMap=new TreeMap<>();
        productsMap.put("1 item","apple");
        productsMap.put("2 item","banana");
        productsMap.put("3 item","pear");
        productsMap.put("4 item","tomato");
        productsMap.put("5 item","mango");
        productsMap.put("6 item","kiwi");
        for (Map.Entry<String,String>p:productsMap.entrySet()){
            System.out.println("Key is "+p.getKey()+" and value is "+p.getValue());
        }
    }

}