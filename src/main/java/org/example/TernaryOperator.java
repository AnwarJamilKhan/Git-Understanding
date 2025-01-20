package org.example;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        int greaternumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the number Checker \n");
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        if(num1 > num2)
        {
            System.out.println("Number 1 is greater than number 2 that is \n" + num1);
            greaternumber = num1;
        }
        else
        {
            System.out.println("Number 2 is greater than number 1 that is \n " + num2);
            greaternumber = num2;
        }
        System.out.println("The number greater is \n" + greaternumber);

        System.out.println("This is the second condition to be run");
         int greaterOfTwoNumbers = num1 >num2 ? num1 : num2;
        System.out.println(greaterOfTwoNumbers + " Is the greatest number");

    }



}
