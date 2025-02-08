package u3practicekunal;

import java.util.Scanner;

/*
 Write a function that returns all prime numbers between two given numbers.
 Given two numbers m and n as interval range, the task is to find the prime numbers in between this interval.

Examples: 

Input: m = 1, n = 10
Output: 2 3 5 7


Input : m = 10, n = 20
Output : 11 13 17 19


 */
public class Practice7 {
    static void primeInRange(int n,int m){
        for (int i = n; i <= m; i++) {
            boolean check = true;
            if (i == 1) {
                continue;
            }
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primeInRange(sc.nextInt(), sc.nextInt());
        sc.close();
    }
}
