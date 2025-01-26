package u3_practice_GPT;

/*
GPT java pahse 1 assignment 
topics
Topic for assignment

Primitive Data Types and Variables
Local static instance instance ,constant variable
Keywords and Identifiers,literals
Input and Output in Java (Scanner and System.in)
All type casting


 Practical Use Cases
Unit Converter: Write a program that converts inches to centimeters, kilograms to pounds, and Celsius to Fahrenheit using constants.
Grade Calculator: Accept marks of three subjects from the user, calculate the percentage, and assign grades based on the percentage.
Banking System: Create a program to calculate compound interest, taking input for principal, rate, and time.
Login System: Write a program that asks for a username and password. Validate the input against pre-defined values.
Shopping Cart Total: Develop a program to calculate the total cost of items in a shopping cart, including tax (use constants for tax rate).
 */

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // String value = sc.nextInt(); // comiple time error

        // int value@123 = 1;// special char is not allowed apart from $ _
        int _value123 = 1;
        // System.out.println(b);

        // What is the result of the following code snippet?
        int x = 10;
        double y = x;
        System.out.println(y);// 10.0 not 10.000000000000000 
        // double has range to store long decimal points but doesn't means it have unnecessary 00000 after typecaste
        
        
        /*
         What are the rules for naming identifiers in Java?
         use _ $ and letter
         small letter 
         and second third letters gets into that letter use Cammel case
         */

    }
}
