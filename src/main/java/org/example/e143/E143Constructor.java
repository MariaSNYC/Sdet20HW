package org.example.e143;

public class E143Constructor {
    public static void main(String[] args) {
        Car s=new Car("Toyota", "Prius", 4, 120,30000.0);
        Car m=new Car("Toyota", "Prius",  120, 30000.0);
        Car l=new Car( 4, 120, 30000.0);
        Car t=new Car("Toyota", "Prius", 4 );

        s.display();
        m.display();
        l.display();
        t.display();

    }
}


