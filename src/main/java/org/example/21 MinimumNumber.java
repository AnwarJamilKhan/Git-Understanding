package org.example;

import java.util.Scanner;

class MinimumNumber {

    public static void main(String[] args) {

        System.out.println("Welcome to the World of Minimum numbers");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the First Number");
        int num1 = input.nextInt();
        System.out.println("Please Enter the Secone Number");
        int num2 = input.nextInt();
        minimumNumber1(num1,num2);
        MinimumNumber minNumber1 = new MinimumNumber();
        int minimumRead = minNumber1.minimumNumber2(num1,num2);
        System.out.println("The minimum number is : " + minimumRead);
    }

    public static void minimumNumber1(int num1, int num2)
    {
        if (num1 < num2)
        {
            System.out.println("Minimum number is: " + num1);
        }
        else if(num2<num1)
        {
            System.out.println("Minimum number is: " + num2);
        }
    }

    public int minimumNumber2(int num1, int num2)
    {
        int minimumNumber = num1 < num2 ? num1 : num2;
        System.out.println("Number that is minimum is : " + minimumNumber);
        return minimumNumber;
    }
}
