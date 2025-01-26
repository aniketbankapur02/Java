/*
package private api
 Problem 1: Create a Custom Package
Create a package mathoperations.
Add two classes:
Addition: A method to add two numbers.
Multiplication: A method to multiply two numbers.
Import this package into a new class and use both methods.
 */



package u4_practice_GPT.u4_mathoperation;
// so this api can be uses as pacakeage private ie within package only
// first compile and create classes of addition and multiplication and use it



 class Addition1{ // package prvate class so it will private api call
    int a;
    int b;

static int add(int a, int b){
        return a + b;
    }
}


 class Multiplication { // package private api
 int a;
 int b;
  static int multiply(int a,int b){
    return a * b;
 }
 }
// public class Math1 {
//     public static void main(String[] args) {
//         Addition1.add(0, 0);
//         Multiplication.multiply(0, 0);
//     }
// }
