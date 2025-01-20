package org.example;

 class StudentTOString {
       String name;
       int age;
       String rolNumber;
       String house;
// This for comment
  public StudentTOString(String name, int age, String rolNumber, String house) {
   this.name = name;
   this.age = age;
   this.rolNumber = rolNumber;
   this.house = house;
  }

public String toString()
{
  return "Student Details:{name:" + name +
          ", age:" + age +
          ", roll:" + rolNumber +
          ", house:" + house + " }";
}

     public static void main(String[] args) {
         StudentTOString sts = new StudentTOString("Prashant", 30, "S345", "Blue");
         System.out.println(sts);
     }
}


