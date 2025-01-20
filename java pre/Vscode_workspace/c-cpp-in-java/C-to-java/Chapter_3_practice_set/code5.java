//Write a program to find the greatest of four numbers entered by the user.
package Chapter_3_practice_set;

import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
                System.out.println("Enter the number :");
            Scanner sc = new Scanner(System.in);
            
            int number1 = 0;
            number1  = sc.nextInt();
            int number2 = 0;
            number2  = sc.nextInt();
            int number3 = 0;
            number3  = sc.nextInt();
            int number4 = 0;
            number4  = sc.nextInt();
            sc.close();

            if (number1 > number2 && number1 > number3 && number1 > number4) {
                System.out.println("number 1 is grater among this four");
            }
            else if (number2 > number3 && number2 > number4 ) {
                System.out.println("number 2 is grater among this four");
            }
            else if (number3 > number4) {
                System.out.println("number 3 is grater among this four");
            }
            else  {
                System.out.println("number 4 is grater among this four");
            }


    }
}
