package com.company;

public class Car {

    // intialize variables
    private String make;
    private String model;
    private int year;
    private double price;

    //now create constructor
    public Car(String make, String model, int year, double price) {
        //using "this" allowing you to distinguish from instance variables and local variables
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

    }


   /* once the constructor has been created, the next step is to create the Getter's and Setter's.
    To avoid typos and save time:
        1. right click on the line with the constructor closing curly bracket (line 20 in this case)
        2. from the menu, select Generate
        3. then select Getter and Setter
*/


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
       return String.format("%1$18s %2$20s %3$7d %4$15.2f" , make, model, year, price);
        //return String.format("%1$18s %2$20s %3$7d %d" , make, model, year, price);
    }
}


