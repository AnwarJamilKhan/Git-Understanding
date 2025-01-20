package org.example;

import java.util.Scanner;

class MultiplicationTableFor {
    public static void main(String[] args) {
        System.out.println("Welcome to the World of Multiplication Table \n");
        Scanner input = new Scanner(System.in);
        int tableNum = input.nextInt();
        System.out.println(" Table of " + tableNum + " is : \n");
        for(int i = 1; i<=10; i++)
        {
            int table = tableNum * i;
            System.out.println(tableNum + " X " + i + " = " + (tableNum * i));
        }
    }
}
