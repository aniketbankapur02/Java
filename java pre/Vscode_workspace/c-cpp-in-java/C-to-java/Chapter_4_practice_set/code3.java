//Write a program to check whether a given number is prime or not using loops.
package Chapter_4_practice_set;

import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong();
        sc.close();

     int prime = 1;
     
     
     if (n <= 1) {
         prime = 0;
        }
        int i = 2;
     while (i < n) {
        
        if (n % i == 0) {
            prime = 0;
            break;
        }
        
        i++;
     }
       if (prime == 0) {
        System.out.println("Not a Prime number");
       }else{
        System.out.println("It is a Prime number");
       }

    }
}
