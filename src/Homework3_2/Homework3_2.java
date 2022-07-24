package Homework3_2;

import java.util.Arrays;

public class Homework3_2 {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Franko Ivan", 10, 100);
        Employee worker2 = new Employee("Ukrainka Lesya", 10, 100);
        Employee worker3 = new Employee("Tykhyi Oleksa", 10, 100);
        worker1.changeRate(20);
        worker2.changeRate(20);
        worker3.changeRate(20);
        System.out.println(worker2);
        Employee.totalSum = worker1.getSalary(worker1.getRate(), worker1.getHours()) +
                worker2.getSalary(worker2.getRate(), worker2.getHours()) +
                worker3.getSalary(worker3.getRate(), worker3.getHours());
        System.out.println("Total salary of all employees: " + Employee.totalSum);

    }
}
