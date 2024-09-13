package org.example.e189;

import java.util.LinkedHashSet;

public class E189Set {
    public static void main(String[] args) {
        LinkedHashSet<String>emailAddresses=new LinkedHashSet<>();
        emailAddresses.add(null);
        emailAddresses.add("john.doe@example.com");
        emailAddresses.add("jane.smith@example.com");
        emailAddresses.add("john.doe@example.com");
        emailAddresses.add("admin@event.com");
        emailAddresses.add("info@company.com");

        for (String e:emailAddresses){
            System.out.println(e);
        }


}

}
