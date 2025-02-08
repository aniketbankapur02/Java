package u3practicekunal;

import java.util.Scanner;

/*
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
 */
public class Practice4 {
        static int fac(int n){
        int ans = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        while (n > 0) {
            ans = ans * n;
            n--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(fac(sc.nextInt()));
    
        sc.close();
    }
}
