//Check if a number is Armstrong Number or not 

/*
Armstrong numbers are numbers which have their sum of cube of individual
digits equal to the number itself.
E.g 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.

 -Binary Number System 
-Reverse Number 
-Armstrong Number 
-Prime Numbers 

There is problem when you use pow() function, this is happening because the return type of pow() is float and it returns numbers like 152.9999 but 0.9999 is truncated as we are storing it as an integer.
-> USE

sum += round(pow(lastdigit, 3));
round() will round 152.9999 to 153 and you will get the correct output.
function

in java
int lastDigit = 3;
int sum = 0;
sum += Math.round(Math.pow(lastDigit, 3));

0:28 Print all prime number between a &b
3:05 Fibenacci sequence
5:35 Factorial of a number n 
7:50 Calculating nCr
9:55 Pascal Triangle

Recursion Challenges -
** Check if an array is sorted or not : 0:10
** Print numbers till n : 4:50
** Find the first and last occurrence of a number in an array :  9:45
 */

 
package loops;

import java.util.Scanner;

class code2{

    static void to_check_number_amstrong_or_not(int digit){

        int check = digit;
        int rev = 0;

        while (digit > 0) {
            int n = digit%10;
            rev = rev + (n*n*n);
            digit /=10;
        }
        System.out.println(rev);

        if (check == rev) {
            System.out.println("It is a amstrong number");
        }else{
            System.out.println("It is a not a amstrong number");
        }

         
    }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int digit = sc.nextInt();
        sc.close();
        to_check_number_amstrong_or_not(digit);
    }
}