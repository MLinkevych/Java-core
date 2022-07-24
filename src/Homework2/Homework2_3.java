package Homework2;

import java.util.Scanner;

public class Homework2_3 {
    public static void main(String[] args) {
        int A[] = new int[4];
        Scanner el = new Scanner(System.in);
                //присвоювання даних масиву
        int n = 0;
        int m = 0;
        for (int i=0; i < A.length; i++) {
            A[i] = el.nextInt();
            if(A[i]%2 == 0) {
                n++;
            }
            else {
                m++;
            }
        }
        // max-min
        int max = A[0];
        int min = A[0];
        int indexMax = 0;
        int indexMin = 0;

        for ( int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                indexMax = i;
            }
            else if (A[i] < min) {
                min = A[i];
                indexMin = i;
            }
        }

        System.out.println("Max digit:" + max + ", Index: " + indexMax);
        System.out.println("Min digit:" + min + ", Index: " + indexMin);
        //avg. of the second part of the array
        int sumSecond = 0;
        int count1 = 0;
        for (int i = 2; i < A.length; i++) {
            sumSecond = sumSecond + A[i];
            ++count1;

        }
        double avg = (double) sumSecond/count1;
        System.out.println("avg. of the second part of the array" + avg);
    //Change 1 and 3 element of the array
        int temp = A[0];
        A[0] = A[3];
        A[3] = temp;
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        //creating new arrays B and C with odd and even elements
        int B[] = new int[m];
        int C[] = new int[n];
        /*for (int a : A) {
            if (A[a]% 2 == 0)  {
                C[a]=A[a];
            }
            else {
                B[a]=A[a];
            }
        }*/
        for (int d = 0; d < C.length; d++) {
            System.out.println(C[d]);
        }
        for (int u = 0; u < B.length; u++) {
            System.out.println(B[u]);
        }



    }

}
