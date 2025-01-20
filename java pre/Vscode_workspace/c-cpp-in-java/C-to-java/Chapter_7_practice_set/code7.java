//Write a program containing a function that reverses the array passed to it.
package Chapter_7_practice_set;

import java.util.Scanner;

public class code7 {

    static void reverse_array(int array[]){//array pointinf to m size obj array in heap
        for (int i = 0; i < (array.length)/2; i++) {
            int temp;
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length -1 ) - i] = temp;

        }
        // after loop obj array is reversed in heap whoever pointing to this object in heap will get updated object
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        
        
        System.out.println("Enter size of array ");
        n  = sc.nextInt();
    

        int arr[] = new int[n];// memory allocation in runtime no need to worry its not in stack GC will deallocate it and memory will be managed
        
        System.out.println("Enter arr");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();




        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse_array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
