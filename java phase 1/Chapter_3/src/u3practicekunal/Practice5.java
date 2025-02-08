package u3practicekunal;
/*
Write a function to find if a String is a palindrome or not. Take number as parameter.

i am using two pointer approach
 */
import java.util.Scanner;

public class Practice5 {
    static boolean checkPalindrome(String s){
        for (int i = 0; i < s.length()/2; i++) {
            int j = (s.length() - 1) - i;

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;// if comes till here it say char are equal in palindrome way
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(checkPalindrome(sc.next()));

        sc.close();
    }

}
