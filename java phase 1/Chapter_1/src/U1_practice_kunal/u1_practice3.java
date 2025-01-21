//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//Take 4 numbers as input and print the largest number.
package U1_practice_kunal;

import java.util.Scanner;

public class u1_practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        char c = sc.next().charAt(0);

        if (c == '+') {
            System.out.println(num1 + num2);
        } else if (c == '-') {
            System.out.println(num1 - num2);
        } else if (c == '*') {
            System.out.println(num1 * num2);
        } else if (c == '/') {
            System.out.println(num1 / num2);
        }

        sc.close();
    }
}
