package u3_more_practice;

import java.util.Scanner;

/*
 1. Is Valid Triangle
Problem Statement:
Given three integers a, b, and c representing the lengths of three sides of a triangle, determine if they can form a valid triangle. A triangle is valid if the sum of any two sides is greater than the third side.

Examples:

python
Copy
Input: a = 3, b = 4, c = 5  
Output: True  
Explanation: 3 + 4 > 5, 4 + 5 > 3, and 3 + 5 > 4.  

Input: a = 1, b = 2, c = 3  
Output: False  
Explanation: 1 + 2 is not greater than 3.  
-----------------------------------------------
2. Is Right-Angled Triangle
Problem Statement:
Given three integers a, b, and c representing the lengths of the sides of a triangle, determine if the triangle is right-angled. A triangle is right-angled if it satisfies the Pythagorean theorem: 
a
2
+
b
2
=
c
2
a 
2
 +b 
2
 =c 
2
  (or any permutation).

Examples:

python
Copy
Input: a = 3, b = 4, c = 5  
Output: True  
Explanation: 3² + 4² = 5² (9 + 16 = 25).  

Input: a = 5, b = 12, c = 13  
Output: True  
Explanation: 5² + 12² = 13² (25 + 144 = 169).  

Input: a = 2, b = 3, c = 4  
Output: False  
Explanation: No combination satisfies the Pythagorean theorem


-------------------
3. Is Leap Year
Problem Statement:
Given an integer year, determine if it is a leap year. A leap year occurs under the following conditions:

If the year is divisible by 4, it is a leap year.

However, if the year is divisible by 100, it is not a leap year unless it is also divisible by 400.

Examples:
python
Copy
Input: year = 2000  
Output: True  
Explanation: 2000 is divisible by 400, so it is a leap year.  

Input: year = 1900  
Output: False  
Explanation: 1900 is divisible by 100 but not by 400, so it is not a leap year.  

Input: year = 2024  
Output: True  
Explanation: 2024 is divisible by 4 and not by 100, so it is a leap year.  

 */
public class Practice3 {
    static boolean checkValidTriangle(int a, int b, int c) {
        boolean check = false;
        // brute forces is imp as sum is of any two sides



        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            check = true;
        }else{
            check = false;
        }

        return check;
    }
    static boolean checkRightTriangle(int a, int b, int c) {
        boolean check = false;
        // c is hypotenis side 


        int LHS = a * a + b * b;
        int RHS = c * c;


        if (LHS == RHS) {
            check = true;
        }else{
            check = false;
        }

        return check;
    }
    static boolean checkLeapYear(int year) {
        boolean check = false;
    
// reason to take 100 is eliminate 00 term like 1900 1900 is not a leap year as it has two zero it will be leap year 
// 400 is best and enought to check a leap year as it will eliminate and see it is leap year or not 
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            check = true;
        }else{
            check = false;
        }

        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println(checkValidTriangle(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        
        // System.out.println(" Enter two side");
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // System.out.println(" ENter hypo side length");
        // int c = sc.nextInt();

        // System.out.println(checkRightTriangle(a, b, c));

        System.out.println(checkLeapYear(sc.nextInt()));
        
        sc.close();

        
    }
}
