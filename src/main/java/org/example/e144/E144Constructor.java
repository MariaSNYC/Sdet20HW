package org.example.e144;

public class E144Constructor {
    public static void main(String[] args) {
        /*Eggs 3.0 Produce true 10
        Paper Towels 2.0 misc false 24
        Paper Towels 2.0 misc false 0*/

        StoreProduct d=new StoreProduct("Eggs",3.0,"Produce",true,10);
        StoreProduct k=new StoreProduct("Paper Towels",2.0,24);
        StoreProduct t=new StoreProduct("Paper Towels",2.0);

        d.display();
        k.display();
        t.display();



    }
}
