package org.example;

import java.util.Scanner;

class PrimeOrNotFor {
    public static void main(String[] args) {
        System.out.println("Welcome to The World of Prime or Not");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int primeNumber = input.nextInt();
        System.out.println("Your Number is " +
                (isPrime(primeNumber) ? "Prime" : "Not Prime"));
    }

    public static boolean isPrime(int num)
    {
        for(int i =2; i <num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
