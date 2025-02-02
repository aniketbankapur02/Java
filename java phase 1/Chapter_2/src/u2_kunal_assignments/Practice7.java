package u2_kunal_assignments;

import java.util.Scanner;

/*
old - new  = ans
(ans / old) * 100 

 Program to find the Discount Percentage
Last Updated : 18 Apr, 2023
Given Marked Price M and Selling price as S of a product. The task is to calculate the Discount Percentage applied to that product.


Examples:  

Input: M = 120, S = 100
Output: 16.66%

Input: M = 1000, S = 500
Output: 50% 

constriats m > s
 */
public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float M = sc.nextInt();
        int S = sc.nextInt();

        float discountOnSelling = ((M - S)/M)*100;

        System.out.println(discountOnSelling + " %");
    }
}
