package org.example;

import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the World of the Simple Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number :\n ");
        int firstInput = input.nextInt();
        System.out.println("Enter the Second Number :\n ");
        int secondInput = input.nextInt();
        System.out.println("Enter the Operator :\n ");
        String operators = input.next();
        BasicCalculator basciCal = new BasicCalculator();
        int calculatedNum = basciCal.claculatedValue(firstInput,secondInput,operators);
        System.out.println("This is the Answer : " + calculatedNum);
    }

    public int claculatedValue(int num1, int num2,String str)
    {
       return switch (str)
       {
           case "+" -> num1+num2;
           case "-" -> num1-num2;
           case "*" -> num1*num2;
           case "/" -> num1/num2;
           default ->  0;

       };
      }
}
