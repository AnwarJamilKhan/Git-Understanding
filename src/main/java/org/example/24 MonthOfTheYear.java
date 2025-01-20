package org.example;

import java.util.Scanner;

class MonthOfTheYear {
    public static void main(String[] args) {

        System.out.println("Welcome to the World of Month in a Calender");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to find the Month of a Year");
        int numOfMonth = input.nextInt();
        MonthOfTheYear monthOfYear = new MonthOfTheYear();
        String month = monthOfYear.calenderMonth(numOfMonth);
        System.out.println("The Calender month correspond to the given number is : "+ monthOfYear.calenderMonth(numOfMonth));
    }

    public String calenderMonth(int num)
    {
        return switch (num)
        {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Number Please Check";
        };
    }
}
