// Create an array of size 3x10 containing multiplication tables of the numbers 2,7 and 9, respectively.
//Repeat problem 7 for a custom input given by the user.
package Chapter_7_practice_set;

import java.util.Scanner;

public class code10 {

    static void multi(int array[][],int no_table[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            array[i][j] = no_table[i] * (j+1) ;
           }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int m,n;
       System.out.println("Enter the 2D array size ");
       m = sc.nextInt();
       n = sc.nextInt();

       int arr[][] = new int[m][n];
       int table_no[] = new int[m];
       System.out.println("Enter the array ");

       System.out.println("Enter any "+ arr.length +" table number to print of your choice ");
       for (int i = 0; i < table_no.length; i++) { // or < m
        table_no[i] = sc.nextInt();
       }
       sc.close();

       multi(arr,table_no);

       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);
       }
    }





    }
}