package u2_kunal_assignments;

import java.util.Scanner;
// Java Program Vowel Or Consonant

public class Practice16 {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        
        if ((c == 'a') || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }

   
        
        sc.close();
    }
}
