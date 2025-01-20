package org.example;

import java.util.Scanner;

class AbsoluteValue {
    public static void main(String[] args) {

        System.out.println("Welcome to the World of Absolute Number");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the Absolute value : \n");
        int enterNumber = input.nextInt();
        AbsoluteValue absValue = new AbsoluteValue();
        System.out.println("The Absolute Value of the given number: "+ enterNumber + " is : " + absValue.absoluteFunction(enterNumber));

    }

    public int absoluteFunction(int num)
    {
        int numAbsolute;
        numAbsolute = num >= 0? num :-num;
        return numAbsolute;
    }
}
