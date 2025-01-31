package u2_kunal_assignments;
/*
 Subtract the Product and Sum of Digits of an Integer
 Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15



Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 */

import java.util.Scanner;

class Solution {
    public int subtractProductAndSum(int n) {
        // int ans = 0;
        int sum = 0;
        int product  = 1;

        while (n > 0) {
            sum += n % 10 ;
            product *= n % 10 ;
            n /= 10;
        }

        // System.out.println(sum + " " + product);



        return product - sum; // product is bigger
    }
}
public class Practice1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.println(s.subtractProductAndSum(sc.nextInt()));
        // s.subtractProductAndSum(sc.nextInt());

        sc.close();
    }
}
