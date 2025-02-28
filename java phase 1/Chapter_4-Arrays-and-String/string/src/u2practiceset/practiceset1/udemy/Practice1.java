package u2practiceset.practiceset1.udemy;

import java.util.Scanner;


/*
 Given a string s, determine if it contains at least two consecutive identical characters. Return true if such a pair exists, otherwise return false.

Examples:

java
Copy
Input: s = "hello"  
Output: true  
Explanation: The string contains "ll", which are two consecutive identical characters.  

Input: s = "world"  
Output: false  
Explanation: No two consecutive characters are identical.  

Input: s = "aabbcc"  
Output: true  
Explanation: The string contains "aa", "bb", and "cc".  
 */
public class Practice1 {
    static boolean checkConsecutive(String s){
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {// imp edge case
                break;
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
    static void checkConsecutive1(String s){
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {// imp edge case
                break;
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println(s.charAt(i) +""+s.charAt(i) );
            }
        }
  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkConsecutive(sc.next()));
        checkConsecutive1(sc.next());
        sc.close();
    }
}
