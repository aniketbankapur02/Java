//star pattern 1
// ****
// *  *
// *  *
// *  *
// ****

// star pattern 2

// **********
// *********
// ********
// *******
// ******
// *****
// ****
// ***
// **
// *

// star pattern 3

//      *
//     **
//    ***
//   ****
//  *****


// star pattern 4

//     1      i th row number printing decreasing (range j > k/2 - i && and j < k/2 example n = 5 range for i = 2 row 3rd print 3 to 1)
//    212     // // to increasing (range j > k/2 && and j < k/2 + i example n = 5 range for i = 2 row 3rd print 1 to 3)
//   32123
//  4321234
// 543212345

// star pattern 5
// * * * * *
// * * * * * *
// * * * * * * *
// * * * * * * * *
// * * * * * * * * *

// star pattern 6
//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****
//    ***
//     *


package loops;

import java.util.Scanner;

public class code8 {
    static void star_pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {// row work
                    System.out.print("*");
                }else{
                    if (j == 0 || j == n - 1) {// column work
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    static void star_pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) { // decreasing order
                    System.out.print("*");
                }
                // else{
                //     System.out.print(".");
                // }
            }
            System.out.println();
        }
    }

    static void star_pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - (i + 1)) { // decreasing order
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void star_pattern4(int n){
        int k = n + n - 1;
        for (int i = 0; i < n; i++) {
            int l = i + 1;
            for (int j = 0; j < k; j++) {
                if ((j >= (k/2) - i) && (j <= (k/2) + i)) { 
                    if ((j >= ((k/2) - i)) && (j < (k/2))) { //print in decreasing order in this range
                    
                        System.out.print(l);
                        l--;
                        
                    }
                    else if ( (j >= k/2) && (j <= ((k/2) + i))){// print in increasing order from this range range start from middle
                        if (j == (k/2)) { // at middle reset to one
                            l = 1;
                        }
                        System.out.print(l);
                        l++;
                    }
                }
                else{
                    System.out.print(" ");
                }
    
            }
            System.out.println();
        }
    }
    static void star_pattern5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void star_pattern5_2(int n){
        int k = n + n -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (j < n + i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****
//    ***
//     *
    static void star_pattern6(int n){
        int k = n + n - 1;
        int l = n * 2;// or n + n
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < k; j++) {
                if(i < l/2){
                if ((j >= (k/2) - i) && (j <= (k/2) + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                }
                else{//          -             i                               +                 i
                if ((j >= ((k/2) - (i - ((i - (l/2))*2 + 1)))) && (j <= ((k/2) + (i - ((i - (l/2))*2 + 1))))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        star_pattern1(n);
        System.out.println();
        star_pattern2(n);
        System.out.println();
        star_pattern3(n);
        System.out.println();
        star_pattern4(n);
        System.out.println();
        star_pattern5_2(n);
        System.out.println();
        star_pattern6(n);

    }
}
