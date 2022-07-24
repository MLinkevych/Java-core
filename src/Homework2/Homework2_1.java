package Homework2;

import java.util.Scanner;

public class Homework2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What \"Time\" is gonna be? ");
        int t = in.nextInt();
        if (t < 0 || t > 59){
            System.out.println("Are you nuts?! Try again \n" + "What \"Time\" is gonna be? ");
            t = in.nextInt();
        }
        else {
            t %= 10;
        }
        System.out.print(trafficLight(t));
    in.close();
    }

    static String trafficLight(int t) {
        if ((t == 4)||(t==5)||(t==9)||(t==0)){
            return "The color is red";
        }
        else {
            return "The color is green";
        }
    }

}
