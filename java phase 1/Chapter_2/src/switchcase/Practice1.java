package switchcase;

import java.util.Scanner;

//Write a program to find whether an alphabet is a vowel or a consonant.
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
            
            System.out.println("vowel");
                break;
        
            case 'e':
            System.out.println("vowel");
                break;
        
            case 'i':
            System.out.println("vowel");
            
                break;
        
            case 'o':
            System.out.println("vowel");
            
                break;
        
            case 'u':
            System.out.println("vowel");
            
                break;
        
            default:
            System.out.println("consonant");
                break;
        }

        // clean way

        switch(c){
            case 'a','e','i','o','u' -> System.out.println("vowel");

            default -> System.out.println("consonant");
        }
    }
}
