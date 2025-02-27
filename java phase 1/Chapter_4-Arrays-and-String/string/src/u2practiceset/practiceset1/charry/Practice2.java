package u2practiceset.practiceset1.charry;

import java.util.Scanner;

/*
 Write your own version of length function from String method
 */
/*
 Write a function slice() to slice a string. It should change the original string such that it is now the sliced strings. 
 Take m and n as the start and ending position for slice.

  Use setCharAt(index, char) for direct modification.
  like char array it is just like [] modufcation

  inset(index,char) wont as it appends it do not replace char at particluar index like [] so we are using setCharAt(index,char)
 */
public class Practice2 {
    static int strlength(String str){
        int counter = 0;
      
        while (str.charAt(counter) != '\0') {// this will index out found bec there is no null char at end you are accessing nothing so give manual null char
            counter++;
        }
        return counter;
    }
    static StringBuilder slice(String s,int m,int n){
        StringBuilder s1 = new StringBuilder(s);
        int i = 0;
        for (; m <= n; i++) {
            // System.out.println(i + " " + m);
            if (m <= n) {
                s1.setCharAt(i,s1.charAt(m));
            }
            m++;

        }
        while (i <= s.length() - 1) {
            s1.setCharAt(i,' ');// use ' ' instead \0 as it not terminator in java like c
            // s1.setCharAt(i,'\0');
            i++;
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // // s = s + '\0';
        // System.out.println(strlength(s +'\0'));// terminate we have to manually add '\0' null char
        System.out.println(slice(s, sc.nextInt(), sc.nextInt()));

        sc.close();
    }
}
