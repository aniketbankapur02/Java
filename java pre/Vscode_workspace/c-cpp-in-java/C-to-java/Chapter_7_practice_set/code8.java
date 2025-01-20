//Write a program containing functions that counts the number of positive integers in an array.
package Chapter_7_practice_set;
import java.util.Scanner;
// in c/c++ we have to clculate the sze of array by using sizeof() operator 
// n = sizeof(arr)/sizeof(arr[0]) 24 / 4   (6 * 4)/ 4 = 6 element array
// in java you have length method for calculating array


public class code8 {

    static int count_arr(int array[],char key){
        int counter = 0;
        // int k = key;
        // System.out.println(k);// to fund ascii value


        for (int i = 0; i < array.length; i++) {
            if (array[i]>0 && key == '+') {
                counter++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]<0 && key == '-') {
                counter++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && key == '0') {
                counter++;
            }
        }

        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n;
       System.out.println("Enter the array size ");
       n = sc.nextInt();

       int arr[] = new int[n];
       System.out.println("Enter the array and choose and Enter which count operation you want to do between + - 0");

       for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
       }
       //System.out.println(" Enter which count operation you want to do between + - 0"); 
       // see input buffer first if char found it will take from input buffer and it will not ask user if not found then only sk user 
       // thats why above is not required here asking char during arra input 

       int k = count_arr(arr,sc.next().charAt(0));// input scanner will take from input buffer

       System.out.println(k);
       sc.close();




    }
}