package loops;
import java.util.Scanner;
public class code6 {
    static long nCr_optimize(int n,int r){
        if (r > n) {
            return 0;// in valid constraits
        }
        if (r == 0 || n == 0) {
            r = 1;
            n = 1;
        }
        long numerator = n;
        long denominator = 1;
        // numerator = fac(n);
        // denominator  = fac(r)  * fac(n - r);
        int i = 1;
        while (i < r) {
            numerator = numerator * ((n - r) + i);
            denominator = denominator * (i + 1);   
            i++;
        }
        // System.out.println(denominator);
        // System.out.println(numerator);



        return numerator/denominator;
    }

    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <  i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pascal_pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <  i + 1; j++) {
                System.out.print(nCr_optimize(i, j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close();
        pascal_pattern(n);
    }
}
