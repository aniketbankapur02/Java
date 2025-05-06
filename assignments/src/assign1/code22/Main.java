package assign1.code22;

import java.util.Scanner;

/*
Write a program to reverse each word of a sentence individually without using built-in
functions.

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();
        sentence += " ";

        String word = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ')
                word += ch;
            else {
                // reverse word
                for (int j = word.length() - 1; j >= 0; j--){
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                word = "";
            }
        }
        sc.close();
    }
}