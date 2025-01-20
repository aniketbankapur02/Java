//Write a program to print first n natural numbers using for loop.
package Chapter_4_practice_set;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        System.out.println("Enter the num :");
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // Write a program to print n natural numbers in reverse order.
        for (int i = n; i != 0; i--) {
            System.out.println(i);
        }

        // Write a program to print the multiplication table of a given number n.

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }

        // Write a program to print natural numbers from 10 to 20 when the initial loop
        // counter i is initialized to 0.
        {
            int i = 0;

            while (i < 21) {
                if (i > 9) {
                    System.out.println(i);
                }
                i++;
            }

        }
        // Write a program to print a multiplication table of 10 in reversed order
        int i = 10;

        while (i != 0) {
            System.out.println(n + "*" + i + "=" + n * i);

            i--;
        }

        // Write a program to sum the first ten natural numbers using a while loop
        int sum1 = 0;

        int m = 1;
        while (m <= n) {
            sum1 = sum1 + m;
            m++;
        }

        System.out.println(sum1);

        // Write a program to implement program 5 using for and do-while loop.
        int sum2 = 0;
        for (int j = 1; j <= n; j++) {
            sum2 = sum2 + j;
        }
        System.out.println(sum2);
        
        int sum3 = 0;
        int l = 1;
        do {
            sum3 = sum3 + l;
            l++;
        }while (l <= n);
        System.out.println(sum3);

    }

}
