package switchcase;

import java.util.Scanner;

// Write a program to write a simple calculator.
public class Practice2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator + - * / % ");
         char c = sc.next().charAt(0);

          
         

        switch (c){
            case '+' :
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
            break;
            case '-' :
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();

            System.out.println(a1 - b1);
            break;
            case '*' :
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();

            System.out.println(a2 * b2);
            break;
            case '/' :
            int a3 = sc.nextInt();
            int b3 = sc.nextInt();
            System.out.println(a3 / b3);
            break;

            case '%' :
            int a4 = sc.nextInt();
            int b4 = sc.nextInt();
            System.out.println(a4 % b4);
            break;

            default:
            System.out.println("Invalid option ");
        }

        sc.close();
    }
}
