package org.example;

import java.util.Scanner;

class DeletingInArray {

     public static void main(String[] args) {
         System.out.println("Welcome to Array Deletion \n");

         Scanner input = new Scanner(System.in);

         int [] arrayNum = ArrayUtility.inputArray();
         System.out.println("Now Enter the number you want to delete: ");
         int numToDelete = input.nextInt();
         int [] newArr = deleteNumber(arrayNum,numToDelete);
         System.out.println("Here is the new Array");
         ArrayUtility.displayArray(newArr);


     }

     public static int[] deleteNumber(int[] numArray, int numToDelete)
     {

        int Occ = OccuranceArray.noOfOccurances(numArray, numToDelete);
        if(Occ ==0)
        {
            return numArray;
        }
        int newArraySize = numArray.length - Occ;
        int [] newArray = new int[newArraySize];

        int i=0,j =0;

        while(i < numArray.length) {
            if (numArray[i] != numToDelete)
            {
                newArray[j] = numArray[i];
                j=j+1;
            }
            i=i+1;
        }
        return newArray;
     }


}
