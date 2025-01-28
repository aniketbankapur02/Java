
/*
 Problem 7: Multi-Condition Evaluator
Write a program that:

Takes three inputs: age, income, and location.
Determines eligibility for a loan based on these conditions:
Age must be above 21.
Income must be above 30,000.
Location must be "Urban".

 */
package u5_part2.u2_practice_of_part2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        int income = sc.nextInt();

        String location = sc.next();
        if (age > 21 && income > 21_000 && location.equalsIgnoreCase("Urban") ) {// if string is in string pool we can do with ==
            // ek bhi false return false
            // if age condition is false it will not check income it will return false
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
        sc.close();

    
    }
}
