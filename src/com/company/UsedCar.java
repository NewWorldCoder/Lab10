package com.company;

/**
 * Created by Victoria on 2/10/2017.
 */
public class UsedCar extends Car {

    private int mileage;

    public UsedCar(String make, String model, int year, double price) {
        super(make, model, year, price);
    }
     //build contructor automatically using: right click-generate - contructor
    public UsedCar(String make, String model, int year, double price, int mileage) {
        super(make, model, year, price);
        this.mileage = mileage;
    }
    //build Getters and Setters
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString(){
        return super.toString() + "\t" + mileage;
    }

}


