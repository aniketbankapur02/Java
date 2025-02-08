package u3practicekunal;

import java.util.Scanner;

/*
 Write a function to check if a given triplet is a Pythagorean triplet or not. 
(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

Input: a = 3, b = 4, c = 5  
Output: True  
Explanation: 3² + 4² = 5² → 9 + 16 = 25.  

Input: a = 5, b = 3, c = 4  
Output: True  
Explanation: The order does not matter.  

Input: a = 2, b = 3, c = 4  
Output: False  
Explanation: No combination of squares adds up to the third.  
 */
public class Practice6 {
    static boolean checkTriplet(int a,int b,int c){
        if ((a * a) == (b * b) + (c * c)  || (a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) ) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkTriplet(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}
