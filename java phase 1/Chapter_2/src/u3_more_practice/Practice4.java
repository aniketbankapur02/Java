package u3_more_practice;

import java.util.Scanner;

/*
 Sum Up to N Numbers and Sum of Divisors
Problem Statement:
Given an integer n, perform the following tasks:

Calculate the sum of all integers from 1 to n (inclusive).

Calculate the sum of all divisors of n (excluding n itself).
Return the results as a tuple (sum_up_to_n, sum_of_divisors).

Examples:

python
Copy
Input: n = 5  
Output: (15, 1)  
Explanation:  
- Sum of numbers from 1 to 5: 1 + 2 + 3 + 4 + 5 = 15  
- Divisors of 5 (excluding 5): 1 → Sum = 1  

Input: n = 6  
Output: (21, 6)  
Explanation:  
- Sum of numbers from 1 to 6: 1 + 2 + 3 + 4 + 5 + 6 = 21  
- Divisors of 6 (excluding 6): 1, 2, 3 → Sum = 6  
 */
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum1 = 0,sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 = sum1 + i;
        }
        for (int i = 1; i < n; i++) {// why no <= bec of excluding
            if (n % i == 0) {
                sum2 = sum2 + i;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        sc.close();
    }
}
