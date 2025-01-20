// Ques3. Write a program to print all prime numbers in a given range
//Calculating nCr

// for optimze use one line calculating formula 
package loops;
import java.util.Scanner;
public class code4 {

    static long fac(int n){
        if (n == 0) {
            return 1;
        }
        long fa = 1;
        for (long i = 1; i <= n; i++) {
            fa = fa * i;
        }
        return fa;
    }
    static long nCr(int n,int r){
        if (r > n) {
            return 0;// in valid constraits
        }
        long numerator;
        long denominator;
        numerator = fac(n);
        denominator  = fac(r)  * fac(n - r);
        // System.out.println(fac(n - r));
        return numerator/denominator;
    }
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

    static void print_prime_in_range(int m,int n){
        int check_prime = 1;
        for (int i = m; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check_prime = 0;
                    break;
                }
                
            }
            if ( check_prime == 1) {
                System.out.println(i);
            }
            check_prime = 1;


            // m++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();


        sc.close();
        long k2 = nCr_optimize(n,r);
        System.out.println(k2);
        
        long k1 = nCr(n,r);
        System.out.println(k1);
        // long k1 = nCr(n,r);
        
        
        // long k = fac(n);
        // System.out.println(k);
        //print_prime_in_range(m, n);




    }
}
