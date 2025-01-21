package Challenge41.example.utils;

import Challenge41.example.geometry.Circle;
import Challenge41.example.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to World of encapsulation ");
        double cirArea;
        Circle circle = new Circle(5.0);
        cirArea = Math.PI * circle.radius * circle.radius;
        System.out.println("The area of Circle is : " + cirArea);

        Rectangle rec = new Rectangle(4.0,5.0);
        double areaOfRectangle;
        areaOfRectangle = rec.length * rec.width;
        System.out.printf("Hello %s! One kilobyte is %,d bytes.", "World", 1024);
        System.out.printf("%f%n", 123456.78);
        System.out.println("The area of Rectangle is : " + areaOfRectangle);
        //System.out.printf("The area of the circle is : %d ", "The area of Rectangle is : %d ", cirArea, areaOfRectangle);
        //System.out.printf("This s a test ", Math.PI);
       // System.out.printf("'%5.2f'%n", cirArea);
        System.out.printf("The area of the circle is : %f", cirArea);
        System.out.printf("The area of the Rectangle is : %f", areaOfRectangle);


    }
}
