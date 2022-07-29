package AdditionalHomework3_1;

import java.util.Scanner;

public class Envelopes {
    static double[] env = new double[4];
    static String yes = "yes";
    char firstChar;

    public Envelopes() {
    }

    public void define() {
        do {

            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                if (i < 2) {
                    System.out.println("Enter the first envelope's sides: ");
                    env[i] = sc.nextDouble();
                } else {
                    System.out.println("Enter the second envelope's sides: ");
                    env[i] = sc.nextDouble();
                }
            }

            if (env[0] > env[2] && env[1] > env[3] &&
                    env[0] > Math.hypot(env[2],env[3]) && env[1] > Math.hypot(env[2],env[3])) {
                System.out.println("You can insert the second envelope into the first");
            } else {
                System.out.println("You can't insert the second envelope into the first");
            }


            Scanner sc1 = new Scanner(System.in);
            System.out.println("Continue: yes or no?");
            String first = sc1.nextLine();
            firstChar = first.charAt(0);


        } while (firstChar == 'y');
    }
}



