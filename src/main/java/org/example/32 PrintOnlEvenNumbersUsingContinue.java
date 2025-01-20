package org.example;

class PrintOnlEvenNumbersUsingContinue {
    public static void main(String[] args) {
        System.out.println("Welcome to the World of the Print Only Even Number Using Continue");

        for(int i = 1 ; i <=100; i++)
        {
            if(i % 2 == 1)
            {
                continue;
            }
            System.out.println(i);
        }


    }

}
