// Create an array of size 3x10 containing multiplication tables of the numbers 2,7 and 9, respectively.
//Repeat problem 7 for a custom input given by the user.

package Chapter_7_practice_set;

import java.util.Scanner;

public class code9 {
    static void multi(int array[][]) {

    }

    static void input_inside_1D_array(int array[][], int m, int n,Scanner sc) {

        if (n == -1) {
            return;
        }
        input_inside_1D_array(array, m, n - 1,sc);
     
        array[m][n] = sc.nextInt();
   
    }

    static void input_2D_array(int array[][], int m, int n,Scanner sc) {

        if (m == -1) {
            return;
        }
        input_2D_array(array, m - 1, n,sc);
        input_inside_1D_array(array, m,n,sc);
        
    }

    static void output_inside_1D_array(int array[][], int m, int n) {

        if (n == -1) {
            return;
        }
        output_inside_1D_array(array, m, n - 1);

        System.out.print(array[m][n]);

    }

    static void output_2D_array(int array[][], int m, int n) {

        if (m == -1) {
            return;
        }
        output_2D_array(array, m - 1, n);
        System.out.println();
        output_inside_1D_array(array, m, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the 2D array size ");
        m = sc.nextInt();
        n = sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("Enter the array and choose and Enter which count operation you want to do between + - 0");

        // recusrsive approach to take input output
        input_2D_array(arr, m - 1, n - 1,sc);
        output_2D_array(arr, m - 1, n - 1);
  
        // imp note use one scanner throught one program and close it after all input

        sc.close();

    }
}
