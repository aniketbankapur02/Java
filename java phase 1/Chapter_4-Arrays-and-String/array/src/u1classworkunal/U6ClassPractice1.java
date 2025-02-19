package u1classworkunal;
/*
 swap array 
 pass array and two index that need to be swapped
 */

 import java.util.Scanner;
 import java.util.Arrays;

/*
 note static method do not use static fields of class it only deals with his parameters
 */
public class U6ClassPractice1 {
    static void swap(int[]arr,int i,int j){
        // for reflection you have to access object via []
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;  
        
 }   
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[4];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    // use to string method for convinent prinitng 
    System.out.println(Arrays.toString(arr));// arrays is class and it has lot of method ot string is one of them and it takes base address of array 
    swap(arr, sc.nextInt(),sc.nextInt());
    System.out.println(Arrays.toString(arr));// arrays is class and it has lot of method ot string is one of them and it takes base address of array 
    sc.close();
 }

}
