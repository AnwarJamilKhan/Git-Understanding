package org.example;

import java.util.Scanner;

class CalculateAreaCircumOfCircle {

  double radiusInMm;

  CalculateAreaCircumOfCircle(double radiusInMm) {
   this.radiusInMm = radiusInMm;
  }

  double getCicumference()
  {

   double circum = 2 * Math.PI * radiusInMm;

   return circum;
  }

  double getAreOfCircle( )
  {
    double area = Math.PI * Math.pow(radiusInMm, 2);
    return area;

  }

  public String toString()
  {
      return "Circle Props: Radius in mm: " +  radiusInMm
              + " , Circumference in mm: " + getCicumference()
              + ", Area in mm2: " + getAreOfCircle();
  }


  public static void main(String[] args) {

   System.out.println("Welcome to World of calculating area and circumferance of circle \n");

   Scanner input = new Scanner(System.in);
   System.out.println("Please Enter the Radius of th Circle");
   double radius = input.nextDouble();

CalculateAreaCircumOfCircle circleArea = new CalculateAreaCircumOfCircle(radius);
System.out.println("The area of the Circle is : " + circleArea );

  }

 }



