package org.example;

import java.util.Scanner;

class MaximumValueForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to the World of Maximum Number");
        Scanner inoput = new Scanner(System.in);
        System.out.println("Enter the Number in Array");
        int [] array1;
        array1 = ArrayUtility.inputArray();
        int max = Integer.MIN_VALUE;
        for (int num: array1)
        {
            if(max < num)
            {
                max = num;
            }
        }
        System.out.println("Maximum Number is : "  + max);
    }
}
