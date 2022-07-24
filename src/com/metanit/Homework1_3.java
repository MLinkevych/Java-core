package com.metanit;

import java.util.Scanner;

public class Homework1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What are \"a\" gonna be? ");
        int a = in.nextInt();
        System.out.println("What are \"b\" gonna be? ");
        int b = in.nextInt();
        System.out.println("What are \"c\" gonna be? ");
        int c = in.nextInt();
        System.out.println("What are \"d\" gonna be? ");
        int d = in.nextInt();
        System.out.println("What are \"a\" gonna be? ");
        int e = in.nextInt();
        double g=Math.sqrt(a*a+b*b);
        double f=Math.sqrt(g*g+c*c);
        double s1=(a*b)/2;
        double s2=(g*c)/2;
        double s3=(e*d)/2;
        double s=s1+s2+s3;
        System.out.println("The area of the pentagon equals: "+s);
        in.close();

    }
}

