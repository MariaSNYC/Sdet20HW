package org.example.e143;

public class Car {
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public Car(String sMake,String sModel,int sNumberOfDoors,int sTopSpeed,double sPrice) {
        make = sMake;
        model = sModel;
        numberOfDoors = sNumberOfDoors;
        topSpeed = sTopSpeed;
        price = sPrice;
    }

        public Car(String mMake,String mModel,int mTopSpeed,double mPrice) {
            make = mMake;
            model = mModel;
            numberOfDoors = 4;
            topSpeed = mTopSpeed;
            price = mPrice;
        }

    public Car(int lNumberOfDoors,int lTopSpeed,double lPrice){
        make="Unknown";
        model="Unknown";
        numberOfDoors=lNumberOfDoors;
        topSpeed=lTopSpeed;
        price=lPrice;
    }
    public Car(String tMake,String tModel,int tNumberOfDoors) {
        make = tMake;
        model = tModel;
        numberOfDoors = tNumberOfDoors;
        topSpeed = 90;
        price = 0.0;
    }

    public void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
}
