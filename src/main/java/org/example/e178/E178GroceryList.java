package org.example.e178;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E178GroceryList {
    public static void main(String[] args) {
        ArrayList<String>groceryItems=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 5 grocery items:");
        for (int i = 0; i < 5; i++) {
            groceryItems.add(s.nextLine());
        }
        // Remove duplicates by converting the list to a LinkedHashSet
        Set<String> uniqueItems = new LinkedHashSet<>(groceryItems);

        // Print the unique grocery items in a single line
        for (String item : uniqueItems) {
            System.out.print(item + " ");
        }

}
}

