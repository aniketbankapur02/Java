package u2_kunal_assignments;

import java.util.Scanner;

// Reverse A String In Java
// below is approch done using swap 
// you can also fill this String s2 = ""; by s1 (input) in reverse order  

public class Practice11 {
    static char[] strToCharArray(String s) {
        char arr[] = new char[1024];
        // System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        arr[s.length()] = '\0';

        return arr;
    }

    static String charArrayToStr(char[] c) {
        String s = "";
        for (int i = 0; c[i] != '\0'; i++) {
            s = s + c[i];// appending string char by chara
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] c = strToCharArray(s);

        for (int i = 0; i < s.length() / 2; i++) {
            char temp = c[i];
            c[i] = c[(s.length() - 1) - i];
            c[(s.length() - 1) - i] = temp;
        }

        s = charArrayToStr(c);

        System.out.println(s);
        sc.close();
    }
}
