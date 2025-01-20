
// 2D array
// access 
// series of 1 D array 
// 2D to function and access and reflecting it in main
//Create a 2-d array by taking input from the user. Write a display function to print the content of this 2-d array on the screen.

//https://www.codecademy.com/learn/learn-java/modules/java-two-dimensional-arrays/cheatsheet

package Chapter_7_practice_set;
import java.util.Scanner;


public class code4 {
    
    static void Display(int array[][]){
    
        for (int i = 0; i < array[i].length; i++) {
            if (i == 0) {
                System.out.print("Even => ");
            }
            else{
                System.out.print("odd => ");
            }
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + ",");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // row wise
      //  int arr[][] = new int[2][4];
        
        // col wise imp if not below formate it will throw an error index out of bound
        int arr[][] = new int[4][2];

        System.out.println("Enter the 4 even number and 4 odd numbers ");

        // col wise access
        //                    2 ka size col
        for (int i = 0; i < arr[i].length; i++) {
            // for (int i = 0; i < arr.length; i++) {
           //                   4 size row size
            for (int j = 0; j < arr.length; j++) {
                // for (int j = 0; j < arr[i].length; j++) {
            
                //col wise
                arr[j][i] = sc.nextInt();
                // row wise
                //arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        Display(arr);
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        
    }
}

