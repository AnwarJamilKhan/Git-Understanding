package org.example;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you name");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.println(name + " , Tell me your age");
        int age = input.nextInt();
        System.out.println(name + " ,your age is " + age);
        System.out.println("Please enter the first number :");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(" The add is :" + sum);

    }
}
