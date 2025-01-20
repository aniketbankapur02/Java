// Write a program using functions to print the following pattern(first n lines):
// *

// ***

// *****

package Chapter_5_practice_set;

import java.util.Scanner;
public class code5 {

    static void star2(int n){
    
        if (n != 0){
            System.out.print("*_");
            n--;
            star2(n);
        } 
        // return;
    }
    
 static void star(int n){
    if (n == 0  ) {
        return;

    }else {
        star(n-1);// for line if 4 lines 4 stack frames and in each line stars  will call star2 to print stars
        // instead of for loop for printing stars we made recursive method calls 
        // for each line stack frame we will call odd number of recursive calls
        // for line 1  stack frame in that one frame we will call 1 stack frame for 1 star print
        // for line 2  stack frame in that one frame we will call 3 stack frame for 3 stars print
        // for line 3  stack frame in that one frame we will call 5 stack frame for 5 stars print
        
        star2(n*2 - 1);// in line odd star printing via recursive calls 
        System.out.println();
    } 
 }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number ");
    int n = sc.nextInt();
    sc.close();

    star(n);
}
   
}
