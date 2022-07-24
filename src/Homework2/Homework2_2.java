package Homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        int count = 0;
        int reverse = 0;
        int count1 = 0;

        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            reverse = reverse * 10 + digit;
            if (digit >= 4) {
                ++count1;
               //
                }
            ++count;
        }
        if (count1==0) {
            System.out.println("There is no number 4 or a bigger digit");
        } else {
            System.out.println("There is a number 4 or a bigger digit");
        }


        System.out.println("Count of digits: " + count);
        System.out.println("Reversed number: " + reverse);

    }

}

