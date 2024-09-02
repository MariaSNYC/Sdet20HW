package org.example.e147;

public class CarObject {
    private String model;
    private double price;
    private int quantity;

    public CarObject(String model, double price,int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }
public double carStockValue() {
    double totalValue = this.price * this.quantity;
    System.out.println(this.model + " Stock Value " + totalValue);
    return totalValue;
}


}
