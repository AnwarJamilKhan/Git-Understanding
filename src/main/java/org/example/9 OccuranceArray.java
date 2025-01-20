package org.example;

import java.util.Scanner;

 class OccuranceArray {
  public static void main(String[] args) {
   System.out.println("Welcome to Array Occurances: \n ");

   Scanner input = new Scanner(System.in);

   int[] numArr = ArrayUtility.inputArray();
   System.out.println("Enter the number you want to find :");
   int num = input.nextInt();
   int occurrences = noOfOccurances(numArr, num);
   System.out.println("Your Element " + occurrences + " time in the Array");

   }

  public static int noOfOccurances(int[] numArr, int num)
  {

   int occ =0;
   int i = 0;

   while(i < numArr.length) {

    if (numArr[i] == num) {
     occ = occ + 1;
    }
    i++;
   }

   return occ;

  }
}
