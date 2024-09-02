package org.example.e148;

public class ShoppingStore {
    private String item;
    private double price;
    private int quantity;

    ShoppingStore(String item,double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }

    public double ItemTotalPrice(){
            double TotalValue=this.price*this.quantity;
            System.out.println(this.item+" total value "+ TotalValue);
            return TotalValue;

        }
    }

