/*
concept 
Armstrong numbers are numbers which have their sum of cube of individual
digits equal to the number itself.
E.g 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.

 1. Armstrong Number Between Two Given Numbers
Problem Statement:

Given two integers low and high, return a list of all Armstrong numbers in the range [low, high]. An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Example 1:

Copy
Input: low = 100, high = 1000
Output: [153, 370, 371, 407]
Explanation:
153 = 1^3 + 5^3 + 3^3
370 = 3^3 + 7^3 + 0^3
371 = 3^3 + 7^3 + 1^3
407 = 4^3 + 0^3 + 7^3
Example 2:

Copy
Input: low = 10, high = 100
Output: []
Explanation: There are no Armstrong numbers between 10 and 100.
Constraints:

1 <= low <= high <= 10^6
 */

package U1_practice_kunal;

import java.util.Scanner;

public class u1_practice7 {
    static void amg_bet_range(int low, int high) {
        int check = 0;
        for (int i = low; i <= high; i++) {
            int num1 = 0;
            int num2 = i;
      

            while (num2 > 0) {            
            num1 = num1 + ((num2 % 10) * (num2 % 10) * (num2 % 10));
            num2 = num2 / 10;
            }
     
            if (i == num1) {
                System.out.println(i + " is amg number");
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("No amg number found");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number and end number ");
        amg_bet_range(sc.nextInt(), sc.nextInt());
        sc.close();

    }
}
