package u2_kunal_assignments;

import java.util.Scanner;

/*
 Java Program for Sum the digits of a given number
Last Updated : 10 Feb, 2023
Given a number, find the sum of its digits.
Example : 


Input : n = 687
Output : 21 (6 + 8 + 7)


Input : n = 12
Output : 3
 */
public class Practice18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
        sum = sum + n % 10;    
            n /= 10;
        }
        System.out.println(sum);

        sc.close();
    }
}
