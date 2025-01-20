package org.example;

import java.util.Scanner;

class GuessGame {

    int random;
    GuessGame()
    {
        random = (int) Math.ceil(Math.random() * 100);
    }

    int Guess(int guessNumber)
    {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the World of Dice Game Guess the Number till it is same to your guess");
        Scanner input = new Scanner(System.in);
        GuessGame guessgame = new GuessGame();
        int guessNum = 0;
        int result;
        do{
            System.out.println("Please enter the number");
            int num = input.nextInt();
            result = guessgame.Guess(guessNum);
            if(result == 0)
            {
                System.out.println("Congrats Your Guess is Correct !");
            }
            else if (result < 0)
            {
                System.out.println("Please Guess Higher Number ");
            }
            else
            {
                System.out.println("Please Guess Lower");
            }
        } while( result !=0);


    }
}
