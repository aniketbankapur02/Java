package u2practiceset.practiceset1.charry;

import java.util.Scanner;


/*
 Write a program to encrypt a string by adding 1 to the ASCII value of its characters.
Write a program to decrypt the string encrypted using the encrypt function in problem 6.

  inset(index,char) wont as it appends it do not replace char at particluar index like [] so we are using setCharAt(index,char)
 */
public class Practice3 {

    static StringBuilder encrypt(String s){
        StringBuilder s1 = new StringBuilder(s);

        for (int i = 0; i < s1.length(); i++) {
            s1.setCharAt(i,(char)(s1.charAt(i) + 1));
        }
        return s1;
    }
    static StringBuilder decrypt(StringBuilder s){
        StringBuilder s1 = new StringBuilder(s);

        for (int i = 0; i < s1.length(); i++) {
            s1.setCharAt(i,(char)(s1.charAt(i) - 1));
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // // s = s + '\0';
        // System.out.println(strlength(s +'\0'));// terminate we have to manually add '\0' null char
        System.out.println(encrypt(s));
        System.out.println(decrypt(encrypt(s)));// sending encrypted string builder to decrypt it

        sc.close();
    }
}
