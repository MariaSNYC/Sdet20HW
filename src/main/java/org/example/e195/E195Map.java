package org.example.e195;


import java.util.*;

public class E195Map {

    public static void main(String[] args) {
        Map<String, List<String>>studentsBySubject=new HashMap<>();
        // Create a Map to store students grouped by subject
        studentsBySubject.put("Mathematics", Arrays.asList("Alice", "Bob"));
        studentsBySubject.put("Science", Arrays.asList("Charlie", "David"));
        studentsBySubject.put("History", Arrays.asList("Eve", "Frank"));

        System.out.println("From Map (Students by Subject):");
        for (Map.Entry<String, List<String>> entry : studentsBySubject.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + " Students: " + entry.getValue());
        }



    }
    }
