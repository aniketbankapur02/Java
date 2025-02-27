package u1classworkunal;

public class U11ClassPractice {

    static boolean palindrome(String s){
        // we have written null condition to avoid null pointer exepection
        // if s.length() is written first and s is null then you will get null pointer execption as null s cannot be used with length method 
        if (s == null || s.length() == 0) {// edge cases null or empty string return flase
            return false;// its upto interviewer
        }
        s = s.toLowerCase();
        int j = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(j - i)) {
                return false;// even if one char is not equal it not palindrome
            }
        }

        // if all checks are passed then it is palindrome

        return true;

    }
    public static void main(String[] args) {
        
    }
}
