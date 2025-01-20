package org.example;

import java.util.Scanner;

class SearchTwoDimentionalArray {

  public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to the World of Searching Two Dimentional Array");
   int [][] numArr2D = ArrayUtility.input2DArray();
   System.out.println("Now Enter the Number you want to search : ");
   int numToSearch = input.nextInt();
   boolean isFound = search(numArr2D, numToSearch);
   if(isFound)
   {
    System.out.println("Your number is found");
   }
   else {
    System.out.println("Your Number is not Found");
   }
  }

  public static boolean search(int [][] numArr, int num)
  {

   int i = 0;
   while(i < numArr.length){
    int j = 0;
    while (j < numArr[i].length){
     if(numArr[i][j] == num){
      return true;
     }
     j++;
    }
    i++;
   }
   return false;
  }
}
