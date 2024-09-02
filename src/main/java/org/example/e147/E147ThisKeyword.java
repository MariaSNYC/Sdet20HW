package org.example.e147;

public class E147ThisKeyword {
    public static void main(String[] args) {
        /*Create an object of the `CarObject` class for a car model "Toyota 2019" with a price of 50000.0 and a quantity of 50.
    - Create another object of the `CarObject` class for a car model "BMW 2019" with a price of 10883.0 and a quantity of 60.
//    - Call the method that calculates and prints the stock value for each car.*/
CarObject T=new CarObject( "Toyota 2019",50000.0,50);
CarObject M=new CarObject("BMW 2019",10883.0,60);
T.carStockValue();
M.carStockValue();
}
    }

