package u2_kunal_assignments;

// Find Ncr & Npr
import java.util.Scanner;

//Find Ncr & Npr

/*
 Permutations: \(7P5=\frac{7!}{(7-5)!}=2520\) ways Combinations: \(7C5=\frac{7!}{5!(7-5)!}=21\) ways
 */
public class Practice10 {
    static int fac(int n) {
        int F = 1;

        while (n > 0) {
            F = F * n;
            n--;
        }

        return F;
    }

    static float nCr(int n, int r) {
        float ans;

        int N = fac(n);
        int D = fac(r) * fac(n - r);

        ans = (float) N / D;
        return ans;
    }

    static float nPr(int n, int r) {
        float ans;

        int N = fac(n);
        int D = fac(n - r);

        ans = (float) N / D;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        // System.out.println(fac(n));

        System.out.println("nCr " + nCr(n, r));
        System.out.println("nPr " + nPr(n, r));

        sc.close();
    }
}
