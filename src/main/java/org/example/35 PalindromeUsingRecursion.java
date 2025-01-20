package org.example;

import java.util.Scanner;

class PalindromeUsingRecursion {
  public static void main(String[] args) {
   System.out.println("Welcome to the Palindrome using Recursion");
   Scanner input = new Scanner(System.in);
   System.out.print("Please Enter a String : ");
   String numEntered = input.next();
   System.out.println("Your String is " + (isPalindrome(numEntered)
                                        ? "Palindrome " : "Not Palindrome"));
  }

  public static boolean isPalindrome(String str)
  {
   if(str.length() <= 1)
   {
    return true;
   }

   int lastPos = str.length() - 1;
           if(str.charAt(0) != str.charAt(lastPos))
           {
          return false;
           }
   String newStr = str.substring(1, lastPos);
   return isPalindrome(newStr);
  }
}
