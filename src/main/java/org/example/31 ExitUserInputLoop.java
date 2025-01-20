package org.example;

import java.util.Scanner;

class ExitUserInputLoop {
  public static void main(String[] args) {
   System.out.println("Welcome to the World of Exit using break in loop");

   Scanner input = new Scanner(System.in);
      while(true)
   {
    System.out.println("Enter Your Command: ");
    String command = input.next();
    if(command.equals("exit"));
    {
     break;
    }
   }

  }

}
