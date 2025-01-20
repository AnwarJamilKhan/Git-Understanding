package org.example;

public class Car1 {

    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car1(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    public String toString()
    {
        return "My Car name is : " + name;
    }
    public static void main(String[] args) {

        Car1 bmw = new Car1(4,4,100,"bmw",
                "x2","BMW");
        System.out.println(bmw.toString());

    }
}
