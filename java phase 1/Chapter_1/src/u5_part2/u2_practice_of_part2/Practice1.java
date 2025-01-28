/*
 Determines the largest of three numbers using the ternary operator.
 */
package u5_part2.u2_practice_of_part2;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int max = (a>b) ? (a > c ? a : c) : ((b > c) ? b : c);
        int max2 = (a>b) ? (a > c ? ((a > d ? a : d)) : (c > d ? c : d)) : ((b > c) ? (b > d ? b : d) : (c > d ? c : d));
       

        /*
         if a> b then check a with c if a> c then a bigger among b n c
         if a ! > then c then c is greater among b n c
         if a < b then check b with c  
         */

         System.out.println("Greatest among 3 is " + max);
         System.out.println("Greatest among 4 is " + max2);


         /*
          Problem 3: Precedence Puzzle
Evaluate the following expressions step-by-step to understand operator precedence:

int result = 10 + 3 * 2 - 4 / 2; -> 14
(5 + 3) * 2 > (10 / 2)  -> 8 * 2 > 5 -> 16 > 5 -> true
10 + (20 - 5 * (2 + 3)) / 5. ->  10 -5/5 -> 10 - 1 -> 9
          */
            int result ;
            System.out.println( result = 10 + 3 * 2 - 4 / 2);
            System.out.println((5 + 3) * 2 > (10 / 2));
            System.out.println( result = 10 + (20 - 5 * (2 + 3)) / 5);

         sc.close();




    }
}
