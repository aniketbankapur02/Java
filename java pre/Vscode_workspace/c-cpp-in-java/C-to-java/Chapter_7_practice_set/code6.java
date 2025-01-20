//Write a program to create an array of 10 integers and store a multiplication table of 5 in it.
//Repeat problem 3 for a general input provided by the user using scanf()

package Chapter_7_practice_set;
import java.util.Scanner;
public class code6 {

    static void sum_mul(int array[],int n){//array pointinf to m size obj array in heap
        for (int i = 0; i < array.length; i++) {
            array[i] = n * (i + 1);
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        
        System.out.println("Enter multiplication number and upto which number you want o multiply ");
        n  = sc.nextInt();
        m  = sc.nextInt();

        int arr[] = new int[m];// memory allocation in runtime no need to worry its not in stack GC will deallocate it and memory will be managed

        sum_mul(arr,n);
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(n + "*" + (i + 1) + "=" + arr[i]);
        }




    }
}
