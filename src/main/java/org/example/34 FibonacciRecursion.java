package org.example;

import java.util.Scanner;

class FibonacciRecursion {
  public static void main(String[] args) {
   System.out.println("Welcome to The World of Fibonacci using Recursion");

   Scanner input = new Scanner(System.in);
   System.out.println("Please enter the number of element to be printed");
   int count = input.nextInt();

   for (int i = 1; i <= count; i++)
   {
    System.out.println(fibonacci(i) + " ");
   }

  }

  public static int fibonacci(int position)
  {
   System.out.print(" . ");
    if(position ==1)
    {
     return 0;
    }
    if(position == 2)
    {
     return 1;
    }
   return fibonacci(position - 1) + fibonacci(position -2 );
  }

}
