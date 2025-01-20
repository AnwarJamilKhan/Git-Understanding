package org.example;

import java.util.Scanner;

 class NumberFussingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the World of Number Guessing Game");
        int computerNum = 5, guessNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        do {
            System.out.println("Please guess the number between 0 to 10");
            guessNumber = input.nextInt();
        } while(computerNum!=guessNumber);
        System.out.println("You have entered the correct number");
    }
}
