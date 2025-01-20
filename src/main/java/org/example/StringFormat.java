package org.example;

public class StringFormat {

    public static void main(String[] args) {
        String name = "Prashant";
        int marks = 45;
        System.out.println("Welcome to the World of String Format");
        System.out.println("Hello " + name + "your mars are" + marks);
        System.out.printf("Hello %s your marks are %d", name,marks);

    }
}
