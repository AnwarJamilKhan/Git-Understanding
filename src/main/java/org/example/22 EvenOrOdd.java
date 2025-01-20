package org.example;

import java.util.Scanner;

class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println("Welcome to the world of Even Or Odd \n");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to Find whether it is Even or Odd");
        int number = input.nextInt();
        System.out.println("The entered number is : " + findOddEven(number));
        EvenOrOdd evenOddObject = new EvenOrOdd();
        evenOddObject.findOddEven1(number);
        System.out.println("The entered number is : " + evenOddObject.findOddEven1(number));

    }

    public static String findOddEven(int num)
    {
        String str1 = "Odd";
        String str2 = "Even";
        if (num % 2 ==0)
        {
            return str2;
        }
        else
        {
            return str1;
        }
    }

    public String findOddEven1(int num)
    {
               return num % 2 == 0 ? "Even" : "Odd";

    }
}
