// imp concepts in array inn java

// access and inintializing a array

// Arrays in memory will be same in all prog language
//This will reserve 4x3=12 bytes in memory. 4 bytes for each integer.

// Pointer Arithmetic in java thereis no pointer we will do haxacode  increament
//Following operations can be performed on pointers:

// Addition of a number to a pointer.
// Subtraction of a number from a pointer
// Subtraction of one pointer from another
// Comparison of two pointer variables


// array allocation in java is in heap in contingous 
// primities array and object array

//Accessing arrays using pointers why to learn this 
// for Passing arrays to functions 
// as in c/c++ call by address is there so pointer arthmatic is imp to access particular array element
//in java internally this will happen by call by value of reference 
// we send copy of value of reference 

// 2D array
// access 
// series of 1 D array 
// 2D to function and access and reflecting it in main

package Chapter_7_practice_set;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        //Write a program to accept marks of five students in an array and print them to the screen.
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();    
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // int arr2[] = new int[5];

        // for (int i = 0; i < arr.length; i++) {
        //     arr2[1] = sc.nextInt();
        //     // arr2++;    invalid
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr2[i]);
        // }
        
        sc.close();
    }
}
