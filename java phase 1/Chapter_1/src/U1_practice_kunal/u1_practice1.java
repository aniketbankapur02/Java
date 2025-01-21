//Write a program to print whether a number is even or odd, also take input from the user.
//Take name as input and print a greeting message for that particular name.


/*
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

Simple Interest Formula
Simple interest is calculated with the following formula: S.I. = P × R × T, where P = Principal, R = Rate of Interest in % per annum, and T = Time, usually calculated as the number of years. The rate of interest is in percentage r% and is to be written as r/100.

Principal: The principal is the amount that initially borrowed from the bank or invested. The principal is denoted by P.
Rate: Rate is the rate of interest at which the principal amount is given to someone for a certain time, the rate of interest can be 5%, 10%, or 13%, etc. The rate of interest is denoted by R.
Time: Time is the duration for which the principal amount is given to someone. Time is denoted by T.
Amount: When a person takes a loan from a bank, he/she has to return the principal borrowed plus the interest amount, and this total returned is called Amount.
Amount = Principal + Simple Interest */
package U1_practice_kunal;

import java.util.Scanner;

/*
 package are here to restrict access like cs and ece department organize as well 
 */
public class u1_practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // in is null ie to take input from keyboard
        System.out.println("Enter number");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }

        System.out.println("Enter your name");
        sc.next();// next leaves \n char in buffer

        // cleaning /n from buffer as next input is of nextLine this method takes \n as input
        // so it will take from buffer and it will not ask user
        sc.nextLine();
        System.out.println("Enter your full name");
        String full_name = sc.nextLine();

        System.out.println("hi hello there :" + full_name);


        sc.close();
    }
}
