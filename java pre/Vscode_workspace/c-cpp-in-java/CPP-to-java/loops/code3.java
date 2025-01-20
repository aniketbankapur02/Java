// Write a program to display all factors of a number.
//Write a program to find the factorial of a given number.
// fibonacii
/*
 A factor of a number is a whole number that can divide the number exactly, without leaving a remainder. Here are some things to know about factors: 
Every number has at least two factors: 1 is a factor of every number, and every number is a factor of itself. 
Prime numbers have only two factors: A prime number's factors are 1 and the number itself. 
Composite numbers have more than two factors: Composite numbers have more than two factors, including prime factors. 
Factors can be positive or negative: For example, the factors of 8 are 1, 2, 4, and 8, but they can also be negative: -1, -2, -4, and -8. 
Factors are important for fractions and patterns: Factors are important for working with fractions and finding patterns in numbers.
 */
package loops;

import java.util.Scanner;

public class code3{
    static int fact(int n){
        int fa  = 1;

        for (int i = 1; i <= n; i++) {
            fa = fa * i;
        }
        return fa;
    }
    static int fibo(int n){
        int n1  = 0;
        int n2  = 1;
        System.out.println(n1 +"\n"+ n2);
        int fibo1 = 0;
        for (int i = 1; i <= n; i++) {
            fibo1 = n1 + n2;
            System.out.println(fibo1);
            n1 = n2;
            n2 = fibo1;
        }
        return fibo1;
    }

    static void factors(int digit){

        for (int i = 1; i <= Math.sqrt(digit); i++) {
            if (digit % i == 0) {
                System.out.println(i);
            }
        }
         
    }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int digit = sc.nextInt();
        sc.close();
        // factors(digit);
        // int k = fact(digit);
        // System.out.println(k);
        int k = fibo(digit);
        System.out.println(digit+"th element is "+ k);
    }
}
