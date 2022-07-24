package com.metanit;

import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = in.nextLine();
        System.out.println("You are " + answer);

        in.close();
    }
}
