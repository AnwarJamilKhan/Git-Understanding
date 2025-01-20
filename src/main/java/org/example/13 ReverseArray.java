package org.example;

class ReverseArray {

    public static void main(String[] args) {

        System.out.println("Welcome to the World of Reverse an Array\n");

        int[] numArray = ArrayUtility.inputArray();
        reversingAnArraynArray(numArray);
        System.out.println("The Reverse Array is: ");
        ArrayUtility.displayArray(numArray);
    }

    public static void reversingAnArraynArray(int [] ReverseArrayNum )
    {
        int i = 0;
        while(i < ReverseArrayNum.length/2)
        {
            int swap = ReverseArrayNum[i];
            ReverseArrayNum[i] =ReverseArrayNum[(ReverseArrayNum.length - 1) -i];
            ReverseArrayNum[ReverseArrayNum.length -1] = swap;
            i = i + 1;
        }
    }
}
