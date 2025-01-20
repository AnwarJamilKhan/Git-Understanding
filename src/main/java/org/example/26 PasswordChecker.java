package org.example;

import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of Password Checker");
        Scanner input = new Scanner(System.in);
        boolean isValid;
        String str;
        do{
            System.out.println("Please Enter your Password: ");
            str = input.nextLine();
        } while (!isAValidPassword(str));
        System.out.println("Thanks for Entering the Valid Password");
    }


    public static boolean isAValidPassword(String str)
    {
        return str.length() >= 6;
    }
}
