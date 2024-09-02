package org.example.e144;

public class StoreProduct {
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    public StoreProduct(String dLabel, double dPrice, String dCategory, boolean dHasExpiration, int dStock){
        label=dLabel;
        price=dPrice;
        category=dCategory;
        hasExpiration=dHasExpiration;
        stock=dStock;
    }
    public StoreProduct(String kLabel, double kPrice,int kStock){
        label=kLabel;
        price=kPrice;
        category="misc";
        hasExpiration=false;
        stock=kStock;
    }
    public StoreProduct(String tLabel, double tPrice){
        label=tLabel;
        price=tPrice;
        category="misc";
        hasExpiration=false;
        stock=0;
    }
    public void display(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}
