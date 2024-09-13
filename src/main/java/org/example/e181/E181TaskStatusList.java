package org.example.e181;

import java.util.ArrayList;

public class E181TaskStatusList {
    public static void main(String[] args){
        ArrayList<Boolean>listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean>listB=new ArrayList<>(listA);
        for (Boolean status:listB){
            System.out.println(status);
        }



        }
    }
