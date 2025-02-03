package u3_more_practice;
/*
 heck Triangle Type
Problem Statement:
Given three integers a, b, and c representing the lengths of the sides of a triangle, determine the type of triangle:

Equilateral: All three sides are equal.

Isosceles: Exactly two sides are equal.

Scalene: All three sides are unequal.

If the sides do not form a valid triangle, return "Not a Triangle".

Examples:

python
Copy
Input: a = 3, b = 3, c = 3  
Output: "Equilateral"  
Explanation: All sides are equal.  

Input: a = 3, b = 4, c = 4  
Output: "Isosceles"  
Explanation: Exactly two sides are equal.  

Input: a = 3, b = 4, c = 5  
Output: "Scalene"  
Explanation: All sides are unequal.  

Input: a = 1, b = 2, c = 3  
Output: "Not a Triangle"  
Explanation: The sides do not satisfy the triangle inequality theorem.  
 */

import java.util.Scanner;

public class Practice5 {

    //Equilateral: All three sides are equal.
    static boolean checkEqui(int a,int b, int c){
        boolean check = true;
        if (a == b && b == c) { // no need of && a == c as first two condition are enough if a == b and b==c it say c == a
            // if (a == b && b == c && a == c) { 
            check = true;
        }else{
            check = false;
        }

        return check;
    }
    // Isosceles: Exactly two sides are equal. any two sides
    static boolean checkiso(int a,int b, int c){
        boolean check = true;
        if ((a == b) || (b == c) || (c == a) ) {
            check = true;
        }else{
            check = false;
        }

        return check;
    }
    // Scalene: All three sides are unequal.
    static boolean checkScalene(int a,int b, int c){
        boolean check = true;
        if (a != b && b != c && a != c) {
            check = true;
        }else{
            check = false;
        }

        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkEqui(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.println(checkiso(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.println(checkScalene(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        
        // System.out.println(checkEqui(3, 3, 3));
        // System.out.println(checkiso(3, 4, 4));
        // System.out.println(checkScalene(3,4 , 5));

        int a = MAX_VALUE;

        sc.close();
    }
}
