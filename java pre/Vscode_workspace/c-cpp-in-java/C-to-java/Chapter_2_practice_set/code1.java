package Chapter_2_practice_set;
//Q3. Write a program to check whether a number is divisible  97 or not.

import java.util.Scanner;

public class code1 {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = in.nextInt();

        in.close();



        if (num1 % 97 == 0) {
            System.out.println("It is divisible");
        }
        else{
            System.out.println("it is not divible");
        }
        
       } 
}
