package Homework3;

import Homework3.Student;

public class Homework3_1 {
    public static void main(String[] args) {
        Student student1 = new Student("John", 4.8 );
        Student student2 = new Student("Mark", 3.5);
        Student student3 = new Student("Pete", 4.2);
        System.out.println(student2);
        System.out.println(Student.betterStudent(student1.getRating(), student3.getRating()));
        System.out.println("Total rating of all students: " + Student.totalRating);
        System.out.printf("Average rating of all students is : %.2f", Student.avgRating);

    }

}
