package org.example;

public class BreakAndContinue {

    public static void main(String[] args) {
        System.out.println("Welcome to the World of BreakAndContinue");
        System.out.println("Before Loop");
        for(int i = 1; i < 1000; i++)
        {
            if( i == 101)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of Loop");

        for(int i = 1; i < 1000; i++)
        {
            if( i == 101)
            {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of Loop");
    }
}
