package assign1.code26;

import java.util.Scanner;

/*
Write a recursive method to compute the Fibonacci sequence up to N terms.
 */
public class Main {
    static int fibo(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int fiboVar = fibo(n - 1) + fibo(n - 2);
        return fiboVar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibo(sc.nextInt()));
        sc.close();
     }
}