package org.example;

import java.util.Scanner;

public class Recusion {
    public static void main(String[] args) {
        System.out.println("Welcome to the World of Factorial using Recursion");
        System.out.println("Welcome to the Recursion");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = input.nextInt();
        long factRecursion = factorialRecursionIterative(num);
        System.out.println("Factorial of your number is : " + factRecursion);
        long factRecursion1 = factorialRecursion(num);
        System.out.println("Factorial of your number is : " + factRecursion1);
    }
    public static long factorialRecursionIterative(int num) {

        long result = 1;
        for (int i = 1; i<= num; i++)
        {
            result *= i;
        }
        return result;
    }
        public static long factorialRecursion ( int num)
        {
            System.out.println("Function Call for the Number : " + + num);
                if(num == 1)
                {
                    return 1;
                }
            return num * factorialRecursion(num -1);
        }
    }

