/*
common pacakages
1)default package is java.lang it has i/o System Math classes
2) java.util need to be explcitly it has Scanner, collections , Random
explore here
https://docs.oracle.com/javase/8/docs/api/

 Problem 5: Import External Package
Use the java.util package to:

Generate 10 random numbers.
Sort these numbers in ascending order.
Print the sorted list.

refer
https://www.geeksforgeeks.org/generating-random-numbers-in-java/

Problem 6: Nested Scopes and Access
Write a program that:

Declares a variable inside a method.
Accesses it within a nested block.
Attempts to access it outside the block (to demonstrate scoping rules).
 */

package u4_practice_GPT;
import java.util.Random;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number for random generated : ");
        int n = sc.nextInt();

        Random r = new Random();

        int randomNumber1 = r.nextInt(n); // generates random number between 0 to n - 1
        int randomNumber2 = r.nextInt(n); // generates random number between 0 to n - 1
        int randomNumber3 = r.nextInt(n); // generates random number between 0 to n - 1
        
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);

        int outterVariable = 0;
        


        {
        int intterVariable = 0;
        System.out.println(outterVariable);
        System.out.println(intterVariable);
        }

        outterVariable = 1;
        // intterVariable = 2; error


        sc.close();
        
    }
}
