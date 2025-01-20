//Write a program to find whether a year entered by the user is a leap year or not. Take the year as input from the user.

package Chapter_3_practice_set;

import java.util.Scanner;

public class code3{
    public static void main(String[] args) {
        System.out.println("Enter the number :");
            Scanner sc = new Scanner(System.in);
            
            int number;

            number  = sc.nextInt();
            sc.close();

            if (number % 4 == 0) {
                System.out.println("leap year");
            } else {
                System.out.println("not a leap year");
            }
    }
}