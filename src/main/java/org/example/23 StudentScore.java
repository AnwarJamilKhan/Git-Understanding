package org.example;

import java.util.Scanner;

class StudentScore {
    public static void main(String[] args) {
        System.out.println("Welcome to the World of the Student Score");
        Scanner intput = new Scanner(System.in);
        System.out.println("Please enter the Student Marks\n");
        int studentNum = intput.nextInt();
        StudentScore stdScore = new StudentScore();
        System.out.println("The status of the Student number is : " + stdScore.studentScoreFinder(studentNum));
    }

    public String studentScoreFinder(int num)
    {
        return  num > 80? "High" : (num > 50? "Moderate": "Low");
    }

}
