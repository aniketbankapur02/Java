package assign1.code24;

import java.util.Scanner;

/*
Find the GCD (Greatest Common Divisor) of two numbers without using recursion.

 */
public class Main {
    static int GCD(int n, int m) {
        int low = (n > m) ? m : n;
        int max = 0;
        for (int i = 1; i <= low; i++) {
            if (((n % i) == 0) && (m % i) == 0) {
                if (i > max) {
                    max = i;
                }
            }
        }
        // System.out.println(max);
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(GCD(n, m));
        sc.close();
    }
}