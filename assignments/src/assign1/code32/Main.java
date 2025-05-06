package assign1.code32;

import java.util.Arrays;

/*
 Implement a method that checks if two strings are anagrams of each other.
 */
public class Main {
    static boolean checkAnagram(String s1,String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);

    }
    public static void main(String[] args) {
    
    }
}