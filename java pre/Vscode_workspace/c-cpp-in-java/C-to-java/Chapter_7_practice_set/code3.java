// 2D array
// access 
// series of 1 D array 
// 2D to function and access and reflecting it in main
// imp point : to acesss 2D array of heap in function as it is pointer like thing you dont need to make formula to access1 D array of  2D array like c/c++ this is because layout of 2D array is not in continuous form
//Create a 2-d array by taking input from the user. Write a display function to print the content of this 2-d array on the screen.

package Chapter_7_practice_set;

import java.util.Scanner;


public class code3 {
    
    static void Display(int array[][]){
    
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("Even => ");
            }
            else{
                System.out.print("odd => ");
            }
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ",");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][4];

        System.out.println("Enter the 4 even number and 4 odd numbers ");

        // row wise access
        //in next code we will implement col wise
        for (int i = 0; i < arr.length; i++) {
            // for (int i = 0; i < 2; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    // for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt(); // no arr[4 * i + j] or // no arr[2 * j + i] first reach particular column by 2 n j and then reach element by ith row
            }
        }

        sc.close();

        Display(arr);
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        
    }
}
