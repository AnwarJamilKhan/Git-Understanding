package org.example;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        System.out.println("Welcome to the World of Do While Loop");
        Scanner input = new Scanner(System.in);
//        System.out.println("Please Enter the Age \n");
//        int age = input.nextInt();;
//
//        while(age <= 0 || age > 100)
//        {
//            System.out.println("Please Enter Your Age");
//            age = input.nextInt();
//        }
        int age = -1;
        do{
            System.out.println("Please Enter Your Age : ");
             age = input.nextInt();
        } while( age <=0 || age > 100);
        System.out.println("Your Age is : " +  age);
    }
}
