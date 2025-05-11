package assign1.code16;

import java.util.Scanner;

/*
Without using relational operators (<, >, ==), write a Java program to find which of two
numbers is greater.
 */
public class Main {
    public static void main(String[] args) {
        int a = 8, b = 5;

        int diff = a - b;
        if ((diff >>> 31) == 0)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");
    }
}
