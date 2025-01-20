package org.example;

import java.util.Scanner;

 class Swap {
  public static void main(String[] args) {

   int num1, num2, swap1;

   Scanner input = new Scanner(System.in);

   System.out.print("Please enter the first number: ");
   num1 = input.nextInt();
   System.out.print("Please enter the second number: ");
   num2 =  input.nextInt();
   System.out.println("First number is " + num1);
   System.out.println("Sceond number is " + num2);
   swap1 = num2;
   num2 = num1;
   num1 = swap1;
   System.out.println("After swap First number is " + num1);
   System.out.println("After swap Sceond number is " + num2);


  }

}
