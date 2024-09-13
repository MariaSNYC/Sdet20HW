package org.example.e194;

import java.util.HashMap;
import java.util.Map;

public class E194Map {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "John");
        studentMap.put(102, "Emily");
        studentMap.put(103, "Michael");
        studentMap.put(104, "Sarah");
        studentMap.put(105, "David");

        System.out.println("Student IDs:");
        for (Integer id : studentMap.keySet()) {
            System.out.println("Student ID: " + id);
        }

        System.out.println("Student Names:");
        for (String names : studentMap.values()) {
            System.out.println("Student Names: " + names);
        }
        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Student Name: " + entry.getValue());


        }

    }
}
