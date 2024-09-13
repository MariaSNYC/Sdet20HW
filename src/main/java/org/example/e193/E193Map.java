package org.example.e193;


import java.util.HashMap;
import java.util.Map;

public class E193Map {

    public static void main(String[] args) {
        HashMap<Integer, String>bookMap=new HashMap<>();
        bookMap.put(101,"The Catcher in the Rye");
        bookMap.put(102,"To Kill a Mockingbird");
        bookMap.put(103,"1984");
        bookMap.put(104,"The Great Gatsby");
        bookMap.put(105,"Moby Dick");

        System.out.println("Initial number of books in catalog: "+ bookMap.size());
        System.out.println("Is the catalog empty? "+bookMap.isEmpty());
        System.out.println("Is book with ID 102 available? " + bookMap.containsKey(102));
        System.out.println("Is the book 1984 available? "+bookMap.containsValue("1984"));
        System.out.println("Updated catalog after removing ID 105: ");
        bookMap.remove(105);
        for (Map.Entry<Integer,String>b:bookMap.entrySet()){
        System.out.println(b);}

       bookMap.clear();
        System.out.println("Is the catalog empty after clearing? "+bookMap.isEmpty() );


    }

}
