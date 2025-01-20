package org.example;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Welcome to the World of Switch\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to know the weekdays");
        int day = input.nextInt();
        oldSwitch(day);
        newSwitch(day);
    }

    public static void  newSwitch(int day)
    {
        String dayStr = switch (day)
        {
            case 1-> "Sunday";
            case 2-> "Monday";
            case 3-> "Tuesday";
            case 4-> "Wednesday";
            case 5-> "Thursday";
            case 6-> "Friday";
            case 7-> "Saturday";
            default -> "Invalid Entery";
        };
        System.out.println(dayStr);
    }

        public static void oldSwitch(int day)
                {
                    switch (day)
                    {
                        case 1:
                        {
                            System.out.println("Today is Sunday");
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Today is Monday");
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Today is Tuesday");
                            break;
                        }

                        case 4:
                        {
                            System.out.println("Today is Wednesday");
                            break;
                        }
                        case 5:
                        {
                            System.out.println("Today is Thursday");
                            break;
                        }
                        case 6:
                        {
                            System.out.println("Today is Friday");
                            break;
                        }
                        case 7:
                        {
                            System.out.println("Today is Saturday");
                            break;
                        }
                        default:
                            System.out.println("Invalid Number not for the week");

                    }
                }
}
