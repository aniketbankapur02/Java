//Input currency in rupees and output in USD.
//To calculate Fibonacci Series up to n numbers.

/*
Fibonacci
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 
 */
package U1_practice_kunal;

import java.util.Scanner;

public class u1_practice5 {
    static void R_to_D(int R) {
        System.out.println(R / 80);
    }

    static void D_to_R(int D) {
        System.out.println(D * 80);
    }

    static void fibo(int n) {
        int n1 = 0;
        int n2 = 1;
        System.out.print("Fibo series : 0 1 ");
        for (int i = 0; i < n - 2; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter ruppiee :");
        // R_to_D(sc.nextInt());
        // System.out.println("Enter Dollar :");
        // D_to_R(sc.nextInt());

        System.out.println("Enter number for n th series");
        fibo(sc.nextInt());
        sc.close();
    }
}
