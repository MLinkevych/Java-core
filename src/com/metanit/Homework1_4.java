package com.metanit;

public class Homework1_4 {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        double a = ((2*getFactorial(5))+(3*getFactorial(8)))/(getFactorial(6)+getFactorial(4));
        System.out.println(a);
    }

}
