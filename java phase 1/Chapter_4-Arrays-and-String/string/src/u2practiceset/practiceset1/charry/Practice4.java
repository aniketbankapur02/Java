package u2practiceset.practiceset1.charry;

import java.util.Scanner;

// Write a program to count the occurrence of a given character in a string.
// Write a program to check whether a given character is present in a string or not.
public class Practice4 {
    static int countChar(String s, char c) {
        // StringBuilder s1 = new StringBuilder(s);

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }

    static boolean checkChar(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // System.out.println(countChar(sc.next(), sc.next().charAt(0)));
        System.out.println(checkChar(sc.next(), sc.next().charAt(0)));
        sc.close();
    }
}
