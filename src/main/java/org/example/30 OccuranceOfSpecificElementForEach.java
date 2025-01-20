package org.example;

import java.util.Scanner;

class OccuranceOfSpecificElementForEach {
  public static void main(String[] args) {
   System.out.println("Welcome to the World of the Occurrence of a Specific Element");
   Scanner input = new Scanner(System.in);
   int [] array1;
   array1 = ArrayUtility.inputArray();
   System.out.println("Now you  enter the number you want to search : ");
   int searchNum = input.nextInt();
   int occurrences = countOccurrences(searchNum,array1);
   System.out.println("Your Element was Found for " + occurrences + " times");
  }

  public static int countOccurrences(int arrayNum, int[] arrayElement)
  {
   int occ = 0;
   for(int num: arrayElement )
   {
    if(num == arrayNum)
    {
     occ++;
    }
   }
   return occ;
  }
}
