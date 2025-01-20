package org.example;

public class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;

    public Car start()
    {
        if(currentFuelInLiters == 0)
        {
            System.out.println("Car is out of Fuel, cannot start the car");
        }
        else if(currentFuelInLiters <= 5)
        {
            System.out.println("Car is in reserve mode. Please refuel");
            //currentFuelInLiters --;
        }
        else
        {
            System.out.println("Car is Started");
            //currentFuelInLiters --;
        }

        return this;
    }
    public void drive()
    {

            currentFuelInLiters --;
            System.out.println("Car is Driving");
    }

    public void addFuel(float currentFuelInLiters)
    {
        this.currentFuelInLiters += currentFuelInLiters;

    }

    public float getCurrentFuelLevel()
    {
        return currentFuelInLiters;
    }


}
