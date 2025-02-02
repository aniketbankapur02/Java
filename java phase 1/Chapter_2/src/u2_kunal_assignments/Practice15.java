package u2_kunal_assignments;

import java.util.Scanner;

// GCD/HCF Of Two Numbers

// LCM formula : L.C.M. = a×b/ gcd(a,b)
public class Practice15 {

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

    static int LCM(int n, int m) {

        int lcm = n * m / GCD(n, m);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // System.out.println(GCD(n, m));
        System.out.println(LCM(n, m));
        sc.close();
    }
}
