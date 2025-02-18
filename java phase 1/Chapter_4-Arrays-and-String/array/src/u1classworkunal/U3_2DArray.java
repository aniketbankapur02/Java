package u1classworkunal;

import java.util.Scanner;
import java.util.Arrays;
public class U3_2DArray {
    public static void main(String[] args) {
        int arr1[][] = new int[3][];
        // there are 3 array each array has some elements
        // 3 array index are 0 1 2
        //    first array is acceseed by [0][],2nd by [1][], 3rd by [2][]

        // unlimated col can be given due to his structure in heap
        // as array size is individual objects col size can be anything 
        // arr1[0][1] = 1;
        // arr1[0][2] = 1;
        // arr1[0][3] = 1;
        // arr1[0][4] = 1;

        // arr1[1] = {1,2}; cannot again do new {} here again means new which we made
        // so only arr1[0][1] can be done after declaration


        // another method to initlize
        int[][] arr2 = {
            {1,2,3},
            {4,5},// col can be flexible 
            {7,8,9} // first sq bracket will give 1 D array arr2[2] -> (i will get 1 D array) -> {7,8,9} and second sq bracket will give mem specific element  
        };


        /*
        i/p and o/p
        first square access the array 
        second square access the specific element in array
         */


         // how to give size for rows and coln refer diagram in note book
         // for row size arr size is 3 as there are 3 1D array each block holding 1 d array
         // to get coln size (ie size of 1 D array) do arr[0] arr[1] arr[2]  i will get from i
         // col size can diff
         for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                /*
                 for first 1 D array size is 3 so inner loop traverse for 3 times for first 1 D array
                 for second 1 D array size is 2 so inner loop traverse for 2 times for first 1 D array
                 for third 1 D array size is 3 so inner loop traverse for 3 times for first 1 D array

                 we got array size via arr2[i].length
                 */
                System.out.print(arr2[i][j] + " ");
            }
            // print line after every row
            System.out.println();
         }

         // enhanced for loop

         for(int i[] : arr2){//here we are giving 1 D array for each iteration so type should be same here i[] is assigned by reference code of row which has 1 D array(refer diagram) reference code given to i array so it traverse for 3 times as row 1 D arry is of 3 size to give three 1 D array
            for (int j : i) {// here i array is travsered and it assinfed to j
                System.out.print(j + " ");
            }
            System.out.println();
         }
         for(int i[] : arr2){//here we are giving 1 D array for each iteration so type should be same here i[] is assigned by reference code of row which has 1 D array(refer diagram) reference code given to i array so it traverse for 3 times as row 1 D arry is of 3 size to give three 1 D array
            System.out.print(Arrays.toString(i) + " ");
            System.out.println();
         }

        for (int i = 0; i < arr2.length; i++) {
            // for (int j = 0; j < arr2[i].length; j++) {

                System.out.print(Arrays.toString(arr2[i]) + " "); // sending 1 D array for every iteration
            // }
            // print line after every row
            System.out.println();
         }






         int[][] arr3 = new int[3][3];
        //  int[][] arr3 = new int[3][]; col length is empty directly using on for loop will give you error
         Scanner sc = new Scanner(System.in);


         // understing nested loop traversing is imp
         /*
        for rach row each col is traversed
         */  
         // input of 2D array
         for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = sc.nextInt();
            }
         }
         // output of 2D array
         for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                 System.out.println(arr3[i][j]);
            }
         }

         sc.close();



    }
}
