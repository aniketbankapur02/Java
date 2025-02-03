package u3_more_practice;
/*
 https://leetcode.com/problems/multiply-strings/?envType=problem-list-v2&envId=math
43. Multiply Strings
Medium
Topics
Companies
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 

Constraints:

1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.

 */
public class Practice6 {
        public static String multiply(String num1, String num2) {
        // System.out.print('1');
        int n1 = 0,n2 = 0;
        for(int i = 0;i < num1.length() ; i++){
            if(num1.charAt(i) >= '0' && num1.charAt(i) <= '9'){
                n1 = (n1 * 10) + num1.charAt(i) - '0';
            }
        }
        for(int i = 0;i < num2.length() ; i++){
            if(num2.charAt(i) >= '0' && num2.charAt(i) <= '9'){
                n2 = (n2 * 10) + num2.charAt(i) - '0';// to decode again use + and store in char and append to string and reverse it
            }
        }
        // System.out.println(n1 + " " + n2);
        

        return "" + (n1 * n2);
        /*
         string can append integers as well
         if not then we have to converst integers to char by removing last digit one by one
         and append to string and we have to reverse the string
         not all test cases was passing bec of big output there is different approach using array
         */
    }

    public static void main(String[] args) {
        System.out.println(multiply("12","12"));
    }
}
