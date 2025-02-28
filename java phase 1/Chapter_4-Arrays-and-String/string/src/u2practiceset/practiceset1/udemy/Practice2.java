package u2practiceset.practiceset1.udemy;

import java.util.Scanner;

/*
 Rightmost Digit in a String
Problem Statement:
Given a string s, find the rightmost digit in the string. If no digit exists, return -1.

Examples:

java
Copy
Input: s = "abc123xyz"  
Output: 3  
Explanation: The rightmost digit in the string is "3".  

Input: s = "hello"  
Output: -1  
Explanation: The string contains no digits.  

Input: s = "a1b2c3d4"  
Output: 4  
Explanation: The rightmost digit in the string is "4".  
Constraints:

1 <= s.length <= 1000

s consists of lowercase and/or uppercase English letters and/or digits.
 */
/*
 approach traverse from right as soon as you get digit just return it
 
 approach two traverse normally from left to right
 store latest digit in temp
 after traversing you gave the right most digit
 return it
 */
public class Practice2 {
      static int getRightMostDigit(String s){
        int temp = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' ) {
                temp = s.charAt(i) - '0';
                // 0 ascci code - 0 assci code = 0
                // 0 ascci code - 1 assci code = 1
                // .
                // .
                // .
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getRightMostDigit(sc.next()));
        sc.close();
    }
}
