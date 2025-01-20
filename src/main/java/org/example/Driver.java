package org.example;

public class Driver {

    public static void main(String[] args) {

//        Car mycar  = new Car();
//        mycar.addFuel(6);
//        mycar.drive();
//        mycar.drive();
//        mycar.drive();
//        System.out.println(mycar.getCurrentFuelLevel());
//        mycar.addFuel(3);
//        System.out.println(mycar.getCurrentFuelLevel());
        //   }

        Car bmw = new Car();
        bmw.addFuel(6);
        Car startedCar = bmw.start();
        //bmw.start();
        //bmw.drive();
        startedCar.start().drive();
    }
}
