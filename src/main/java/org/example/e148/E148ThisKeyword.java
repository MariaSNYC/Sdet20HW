package org.example.e148;

public class E148ThisKeyword {
    public static void main(String[] args){
        ShoppingStore object1=new ShoppingStore("Blanket",49.99,2);
        ShoppingStore object2=new ShoppingStore("Mattress",219.59,2);

        double blanketTotal= object1.ItemTotalPrice();
        double mattressTotal= object2.ItemTotalPrice();

        double totalSum=blanketTotal+mattressTotal;
        System.out.println("You purchased "+totalSum+" today");

    }
}
   