package org.example;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {

        System.out.println("Welcome to The World of ForEach Loop");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int num = input.nextInt();
        String [] array1= new String[]
                {
                        "Name1","Name2","Name3","Name4","Name5","Name6"
                };
printArray(array1);
printArrayForEach(array1);
    }

    public static void printArrayForEach(String[] array12)
    {
        for (String name :array12)
        {
            System.out.println("The names is : \n" + name);
        }
    }
    public static void printArray(String[] array1)
    {
            for(int i = 0; i < array1.length; i++)
            {
                System.out.println(array1[i]);
            }
    }
}
