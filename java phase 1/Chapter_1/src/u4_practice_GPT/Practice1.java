/*
 package and scoping 
 GPT java pahse 1 assignment 1 25/1/2025
topics
packages ad scoping 
 2. Coding Problems

IMP  note to use this as a api via import make sure you make end product ie to compile in classes or jars(a compression from of class as production code)
Problem 1: Create a Custom Package
Create a package mathoperations.
Add two classes:
Addition: A method to add two numbers.
Multiplication: A method to multiply two numbers.
Import this package into a new class and use both methods.



Problem 2: Variable Scope Demonstration
Write a program that demonstrates the difference between:

Local variables
Instance variables
Static variables


Problem 3: Managing Access Levels
Create two classes in the same package:

A BankAccount class with private fields for account number and balance.
Provide public methods to deposit, withdraw, and check balance.
Create a TestBankAccount class to use these methods.
Problem 4: Global and Local Scope Conflict
Write a program where a method has a local variable with the same name as an instance variable.

Use the this keyword to resolve the conflict.
Problem 5: Import External Package
Use the java.util package to:

Generate 10 random numbers.
Sort these numbers in ascending order.
Print the sorted list.
Problem 6: Nested Scopes and Access
Write a program that:

Declares a variable inside a method.
Accesses it within a nested block.
Attempts to access it outside the block (to demonstrate scoping rules).

5. Practical Use Cases
Use Case 1: Package-based Calculator
Develop a package calculator containing:

Add class
Subtract class
Multiply class
Divide class
Create a main program to use these operations.

Use Case 2: Scoping in Games
Write a program for a simple game where:

Local variables handle player actions within a method.
Instance variables store player health and score.
Static variables track the total number of players.
 */

 // using public api of problem 1 ie of math operation
package u4_practice_GPT;
import u4_practice_GPT.u4_mathoperation2.Addition;
import u4_practice_GPT.u4_mathoperation2.Multiplication;


/*
you dont need to import if you use like below
 u4_practice_GPT.u4_mathoperation2.Addition.add(1,1);
 as it knows where the class is 
 */
public class Practice1 {
    public static void main(String[] args) {

        System.out.println(Addition.add(1,1));
        // System.out.println(Multiplication.mul(1,1));// it can be used as mul is package private 
        // this is due to specific access
        
    }
}
