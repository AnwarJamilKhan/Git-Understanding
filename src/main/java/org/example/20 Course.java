package org.example;

class Course {
    static int maxCapacity =100;
    String courseName;
    int enrollments;
    String [] enrolledStudents;

    Course(int maxCapacity, int enrolledStudents, String courseName)
    {
        this.courseName = courseName;
        this.enrollments = 0;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new String[maxCapacity];
    }

    Course(String courseName)
    {
        this(0,0,"History");
    }



    public static void setMAxCapacity(int maxCapacity)
    {
        Course.maxCapacity = maxCapacity;
    }

    public void enrollStudent(String StudentName)
    {
        enrolledStudents[enrollments] = StudentName;
        enrollments++;
    }

    public void unenrollStudent(String StudentName)
    {
        System.out.println("Student Removed");
        enrollments--;
    }

    public static void main(String[] args) {

        Course mycourse = new Course(80,60,"Physics");
        mycourse.enrollStudent("Bill Khan");
        mycourse.enrollStudent("Sid Khan");
        System.out.println("Total number of student enrolled is : " + mycourse.enrollments);
    }
}