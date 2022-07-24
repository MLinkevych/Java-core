package com.metanit;

import java.util.Scanner;

public class Homework1_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What are \"a\" gonna be? ");
        int a = in.nextInt();
        System.out.println("What are \"b\" gonna be? ");
        int b = in.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        double f = a / b;
        System.out.println("The results are: ");
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a * b = " + e);
        System.out.println("a / b = " + f);
        in.close();
    }
}
