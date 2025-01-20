// Write a program using functions to print the following pattern(first n lines):
// *

// ***

// *****

package Chapter_5_practice_set;

import java.util.Scanner;
public class code4 {

    
 static void star(int n){
    if (n == 0  ) {
        return;

    }else {
        star(n-1);
        for (int i = 1; i <= (n*2 - 1) ; i++) {
            System.out.print("*_");        
        }
        // for (int i = 1; i < n*2 ; i++) { // here running loop for odd times by -1 the range
        //     System.out.print("*_");        
        // }

        System.out.println();
        // return; any way frame will end after above line print so need to give special void return
        // it is is void no need to return at end of logic
        
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
