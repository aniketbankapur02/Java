package assign1.code23;

import java.util.Scanner;

/*
Write a program to reverse each word of a sentence individually without using built-in
functions.

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 2; i <= N; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.print(i + " ");
        }
        sc.close();
    }
}