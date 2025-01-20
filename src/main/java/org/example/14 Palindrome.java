package org.example;

 class Palindrome
 {
     public static void main(String[] args) {

         System.out.println("Welcome to the World of Palindrome Checker:");

         int [] numArrayPalindrome = ArrayUtility.inputArray();

         boolean bolPalindrome = isPalindrome(numArrayPalindrome);
         if(bolPalindrome)
         {
             System.out.println("The Array is Palindrome");

         }

         else
         {
             System.out.println("The Array is not a Palindrome");
         }

     }


     public static boolean isPalindrome(int[] numArr){
         int i = 0;

         while (i < numArr.length/2){
             if(numArr[i] != numArr[numArr.length -1 -i]){
                 return false;
             }
             i++;
         }
         return true;
     }
 }
