package assign1.code21;

import java.util.Scanner;

/*
Implement a program to find and print all Armstrong numbers between 1 and 10000
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        for (int i = 1; i <= 10000; i++) {
            int n = i;
            int amg = 0;
            while (n > 0) {
                amg = amg + (n % 10) * (n % 10) * (n % 10); 
                n /= 10;
            }
            if (amg == i) {
                check = true;
                System.out.println(i);
            }
        }
        if (!check) {
            System.out.println("no amg");
        }
        sc.close();
    }
}