package org.example;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        System.out.println("Welcome to the World of For Loop");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number to print the serires of number to 100");
        int num = input.nextInt();

        int j = 0 ;
        while (j<=num)
        {
            System.out.println(j + "");
            j++;
        }

        for(int i =0; i <= num; i++)
        {
            System.out.println("Print the Number \n" + i);
        }
    }
}

