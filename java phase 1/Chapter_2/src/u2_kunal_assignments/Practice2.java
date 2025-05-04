package u2_kunal_assignments;
// input a number and print all the factors of that number (use loops).
// https://www.geeksforgeeks.org/find-all-factors-of-a-natural-number/
// later try oprimize approch  time complexity for optimize solution is  O(sqrt(n))
// below solution is of O(n)

import java.util.Scanner;

/*
 Perfect multiples(factors)
 A factor of a number is a whole number that can divide the number exactly, without leaving a remainder. Here are some things to know about factors: 
Every number has at least two factors: 1 is a factor of every number, and every number is a factor of itself. 

 */
public class Practice2 {
    public static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {// if i can divide n completly then it will be whole number
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factors(n);
        sc.close();
    }
}
