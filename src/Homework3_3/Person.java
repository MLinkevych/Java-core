package Homework3_3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        setFirstName(sc.nextLine());
        System.out.println("Enter the last name: ");
        setLastName(sc.nextLine());
        System.out.println("Enter the birth date: ");
        setBirthYear(sc.nextInt());
        sc.close();
    }

    public void output(){
        System.out.println("Person's data: \n Name: " + getFirstName()
        + " " + getLastName() + "/" + getBirthYear() + " Age: " + getAge());
    }
    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge(){
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        return year - birthYear;
    }
}
