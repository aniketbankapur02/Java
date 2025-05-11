package assign1.code30;



/*
 Implement a method that finds the longest palindromic substring in a given string.
 */
public class Main {
    public static String longestPalindromicSubstring(String s) {
        int start = 0, maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            // Even length
            int low = i - 1, high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--; high++;
            }

            // Odd length
            low = i - 1; high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--; high++;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("babad"));
    }
}