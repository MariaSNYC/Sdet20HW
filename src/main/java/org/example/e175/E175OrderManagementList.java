package org.example.e175;

import java.util.ArrayList;

public class E175OrderManagementList {
    public static void main(String[] args){
        ArrayList<Integer>quantity=new ArrayList<>();
        quantity.add(111);
        quantity.add(111);
        quantity.add(111);
        quantity.add(999);
        quantity.add(999);
        quantity.add(999);

        for (Integer q:quantity){
            System.out.println(q);
        }



    }

}
