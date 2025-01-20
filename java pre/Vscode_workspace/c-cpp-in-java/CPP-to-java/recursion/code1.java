//fibo
//factorial
//Sum till n
// Objective: To get the sum of the first n number using recursion.

/*
 Print the numbers in the sequence:

Objectives:
1. Print the number in increasing order up to n.
2. Print the number in decreasing order from n to 1.
 */

 /*
  To calculate np using Recursion
  Objective: To calculate pth power of n i.e. n^p
  */
package recursion;

import java.util.Scanner;

public class code1 {

    static int fibo(int n){
        if (n == 1 ) {
            return 0;
        }else if (n == 2) {
            return 1;
        } else {
           n =  fibo(n - 1) + fibo(n - 2);
        }
        return n;
    }
    static int fac(int n){
        if (n == 1) {
            return 1;
        }else{
            n = n * fac(n - 1);
        }
        return n;
    }
    static int sum(int n){
        if (n == 1) {
            return 1;
        }else{
            n = n + sum(n - 1);
        }
        return n;
    }
    static void increase(int n){
        if (n == 0) {
            return;
        }
        increase(n - 1);
        System.out.print(n);
    }
    static void decrease(int n){
        if (n == 1) {
            System.out.print(n);
            return;
        }
        // if (n == 0) {
        //     return;
        // }
        System.out.print(n);
        decrease(n - 1);
    }
    static int n_to_power_calculation(int n,int p){
    
        if (p == 1) {
            return n;
        }
        // if (p == 0) {
        //     return 1;
        // }
        
        n = n * n_to_power_calculation(n,p - 1);// quiz  think why n is not affected 

        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        sc.close();    
        int k1 = fibo(n);
        System.out.println(k1);
        int k2 = fac(n);
        System.out.println(k2);
        int k3 = sum(n);
        System.out.println(k3);
        increase(n);
        System.out.println();
        decrease(n);
        System.out.println();
        int k4 = n_to_power_calculation(n, p);
        System.out.println(k4);


    }
}
