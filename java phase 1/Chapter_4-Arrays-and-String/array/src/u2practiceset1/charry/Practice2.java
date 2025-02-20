package u2practiceset1.charry;

import java.util.Scanner;

/*
 Create an array of size 3x10 containing multiplication tables of the numbers 2,7 and 9, respectively.
Repeat problem 7 for a custom input given by the user
 */
public class Practice2 {
    static void mul(int[][] arr,int[] n){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n[i] * (j + 1);
                /*
                 in c/c++ we were passing arra to pointer so to control array via pointer we have to ues formula 
                 */
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(n[i] + " * " + (j + 1) + " = " + arr[i][j]);
            }
            System.out.println("----------------------------------------------");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nunmber of tables you want to store");
        int i = sc.nextInt();
        
        System.out.println("tables you want to till :");
        int j = sc.nextInt();
        
        int[][] arr = new int[i][j];
        
        
        int[] arr1 = new int[i];
        System.out.println("Which tables you want to make ");
        
        for (int k = 0; k < arr1.length; k++) {
            arr1[k] = sc.nextInt();
        }

        mul(arr, arr1);

        sc.close();
        



    }
}
