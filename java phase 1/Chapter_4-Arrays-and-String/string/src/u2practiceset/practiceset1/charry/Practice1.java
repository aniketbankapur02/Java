package u2practiceset.practiceset1.charry;

import java.util.Scanner;

// learn from sratch or improve speaking
// you should able to edit nav and category,sidebar by adding generated URL blof
/*
 generate blog via single or multiple slugs
 structure blog by making edit nav(note nav should be updated dynamicly based on categories ) and category,sub category,sub sub category,sidebar
 */
// https://www.codewithharry.com/videos/c-tutorial-in-hindi-with-notes/
// 1 Which of the following is used to appropriately read a multi-word string
// dont use next or nextLine for direct sentence take char for input
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";// allocation empty string in string pool now i need to take input
        

        int i = 0;
        // while ( s == "" || s.charAt(i - 1) != '\n' || s.charAt(i - 1) != '0') {
        //     s += sc.next().charAt(0);// this sc.next() is string and for string we can apply string method ie .charAt(i) to sc.next() which is a string
        //     if (i == 1) {
        //         System.out.println(s.charAt(1));
        //     }
        //     i++;
        // }
        while (true) {
            if (s.charAt(i) == '\n' || s.charAt(i) == '0') {
                break;
            }
            s += sc.next().charAt(0);// this sc.next() is string and for string we can apply string method ie .charAt(i) to sc.next() which is a string
            i++;
        }


        System.out.println(s);


        sc.close();
    }
}
