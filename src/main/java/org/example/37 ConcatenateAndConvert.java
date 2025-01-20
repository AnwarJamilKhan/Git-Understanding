package org.example;

class ConcatenateAndConvert {

 public static void main(String[] args) {
  System.out.println("Welcome to the World of Concatenate And Convert");
  String firstName = "Anwar";
  String lastName = "Jamil";
  String fullName = firstName + " " + lastName;
  String fullNAmeConcat = firstName.concat(" ").concat(lastName);
  System.out.println("Full Name is  " + fullName);
  System.out.println("Full Name is  " + fullNAmeConcat.toLowerCase());
  System.out.println("Full Name is  " + fullNAmeConcat.toUpperCase());

 }
}
