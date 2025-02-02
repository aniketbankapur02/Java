package u2_kunal_assignments;

import java.util.Scanner;

//Java Program to Check if a Given Number is Perfect Number
/*
 A perfect number is a positive integer that is equal to the sum of its positive proper divisors.
  For example, 6 is a perfect number because \(1+2+3=6\).           

Perfect numbers = sum of its divisors 

\(6\) is a perfect number because \(1+2+3=6\).
\(28\) is a perfect number because \(1+2+4+7+14=28\).
\(496\) is a perfect number.
\(8128\) is a perfect number.


 */
public class Practice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int LHS = 0,RHS = n;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                LHS = LHS + i;
            }
        }
        if (LHS == RHS) {
            System.out.println("Perfect numbers");
        }else{
            System.out.println("Not perfect numbers");
        }
        sc.close();
    }
}
