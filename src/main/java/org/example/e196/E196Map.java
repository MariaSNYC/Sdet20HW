package org.example.e196;

import java.util.*;

public class E196Map {

        public static void main(String[] args) {
            Map<String, List<String>>depsAndEmployees=new LinkedHashMap<>();
            depsAndEmployees.put("HR employees", Arrays.asList("Alice","Bob"));
            depsAndEmployees.put("IT employees",Arrays.asList("Charlie","David","Eve"));
            depsAndEmployees.put("Finance employees",Arrays.asList("Frank","Grace"));

            for (Map.Entry<String, List<String>> d:depsAndEmployees.entrySet()){
                System.out.println("Department: "+d);

            }




        }
    }


