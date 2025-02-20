package u2practiceset1.charry;

import java.util.Scanner;

/*
 Write a program containing functions that counts the number of positive integers in an array.
 */
public class Practice1 {
    static void  count(int[] arr){
        int counterP = 0;
        int counterN = 0;
        int counterZero = 0;
     for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            counterP++;
        }
     }   
     for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            counterN++;
        }
     }   
     for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            counterZero++;
        }
     }   

     System.out.println("Positive numbers count " + counterP + "\nNegative numbers count " + counterN + "\nzero element count " + counterZero);
    }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{-1,1,0,0,-2,2,3,4,-3};
        count(arr);
        sc.close();
    }
}
