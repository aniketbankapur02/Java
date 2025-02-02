package u2_kunal_assignments;
// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

/*
  Check if a String is a Palindrome
Problem Statement:

Given a string s, determine if it is a palindrome. A string is a palindrome if it reads the same backward as forward. Ignore non-alphanumeric characters and consider case insensitivity.

Example 1:

Copy
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: After removing non-alphanumeric characters and converting to lowercase, the string becomes "amanaplanacanalpanama", which is a palindrome.
Example 2:

Copy
Input: s = "race a car"
Output: false
Explanation: After removing non-alphanumeric characters and converting to lowercase, the string becomes "raceacar", which is not a palindrome.
Example 3:

Copy
Input: s = " "
Output: true
Explanation: An empty string is considered a palindrome.
Constraints:

1 <= s.length <= 2 * 10^5

s consists only of printable ASCII characters.

Function Signature:

python
Copy
def isPalindrome(s: str) -> bool:
 */

 /*
  "madam" is odd palindrome.
"hello" is not palindrome.
kaak is even palindrome

  */



 
public class Practice12 {


  // two pointer apparoach
static void checkPalindrome1(String s){// s takes hexa code of main string therfore this will also point to same object in heap
  boolean check = true;
  //imp egde case to consider
  // to ignore case we will do string to lowercase

  s = s.toLowerCase();

  // there is no method to compare char by ignoring case so will so we have to do lowercase directly to string
int j = s.length() - 1;
  for (int i = 0; i < s.length() / 2; i++) {
    if (s.charAt(i) != s.charAt(j - i)) {
      check = false;
    }
  }
/*
 if check is false was and and inside if check is true then it will be 
 if (check == false)
 then it is palindrome
 */
  if (check) {// if check remains true then palindrome
    System.out.println("Palindrome");
  }else{
    System.out.println("Not palindrome");
  }
  
}

/*
 another approach is by doinog reverse of string and checking reverse and original 
 if reverse == orignal then it is palindrome
 else not palindrome
 */

    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

        String s = sc.next();

          checkPalindrome1(s);

       
        sc.close();
    }
}
