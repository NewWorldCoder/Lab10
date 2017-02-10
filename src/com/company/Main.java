package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput;
        System.out.println("We have unique selection of vintage and new cars. Please refer to our current inventory list.");
        System.out.println();
        ArrayList<Car> carList = new ArrayList<Car>();
        listOfCars(carList);

        do {

            userInput = promptBuyer(scan, carList);

        } while (userInput.equalsIgnoreCase("y"));

        System.out.println();
        System.out.println("Thank you for shopping at Unique Autoworks.");

    }

    public static String promptBuyer(Scanner scan, ArrayList<Car> carList) {

        int selectCar;
        String userInput;
        displayCars(carList);
        System.out.println();

        System.out.println("Which car are you interested in?");
        selectCar = rangeValidator();

        //will remove selected car from inventory
        System.out.println(carList.get(selectCar - 1));
        System.out.println();

        System.out.println("Is this the car you'd like to purchase? y/n");
        userInput = scan.nextLine();

        askToBuyCar(selectCar, userInput, carList);

        System.out.println("Do you want to continue? y/n");
        userInput = scan.nextLine();
        return userInput;

        //each question for the user along with what should display depending on the answer

    }


        /*Car car1 = new Car("Ford", "Explorer", 1996, 27999.99);
        Car car2 = new Car("Buick", "Roadmaster", 1994, 23125.41);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car2 + " Was the best car and my favorite!");
        // write your code here*/


    //}

    public static void listOfCars(ArrayList<Car> carList) {
        // ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Car("Ford", "Explorer", 2016, 27999.99));
        carList.add(new Car("Buick", "Lucerne", 2016, 32999.99));
        carList.add(new Car("Lincoln", "MKZ", 2017, 52999.99));
        carList.add(new Car("Volvo", "Eskimo", 2016, 41999.99));
        carList.add(new Car("GMC", "Safari", 2016, 27999.99));
        carList.add(new Car("Chevrolet", "Caprice Classic", 2016, 21999.99));


        //ArrayList<UsedCar> carList2 = new ArrayList<UsedCar>();
        carList.add(new UsedCar("Ford", "Focus", 2009, 7875.99, 175235));
        carList.add(new UsedCar("Plymouth", "Fury", 1998, 875.99, 235235));
        carList.add(new UsedCar("Chrysler", "New Yorker", 2001, 9875.99, 97850));
        carList.add(new UsedCar("Dodge", "Dart", 1977, 456.00, 301285));
        carList.add(new UsedCar("Chevrolet", "Vega", 1976, 320.15, 78525));

        //this will add another vehicle(s) to your list for either array
        carList.get(1).setMake("Fiat");
        carList.get(1).setModel("Spyder");
        carList.get(1).setYear(2017);
        carList.get(1).setPrice(15999.99);




        // for (UsedCar c : carList2) {
        //     System.out.println(c);
    }

    public static void askToBuyCar(int carPick, String userInput, ArrayList<Car> carList) {

        if (userInput.equalsIgnoreCase("y")) {

            System.out.println("Great selection.");
            System.out.println();
            carList.remove(carPick - 1);
            //removes the car that the user selected yes to purchase
            displayCars(carList);
            System.out.println();

        } else {

            System.out.println();
            System.out.println("We have cars delivered twice weekly.  Do stop in again.");
            System.out.println("Thank you.");
            System.out.println();

        }

    }

    public static void displayCars(ArrayList<Car> carList) {

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i) instanceof UsedCar) {
                System.out.print("USED: ");
                System.out.printf("%d. %s\n", i + 1, carList.get(i).toString());
            } else {
                System.out.print("NEW: ");
                System.out.printf("%d. %s\n", i + 1, carList.get(i).toString());
            }
        }
        //for (Car c : carList) {

            //System.out.println(c.toString());
        //}
        //formats and displays the number of cars, along with a description of each
        //%d. creates a . next to each #, i + 1 makes the numbers get higher along with the list

    }

    public static int rangeValidator() {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        while (input < 1 || input > 12) {

            System.out.println("please enter a number between 1 and 11!");
            input = scan.nextInt();
            scan.nextLine();
        }

        return input;

        //validates that the user is inputting a valid number
    }
}

