// Write a recursive function to calculate the sum of first n natural numbers.
//Write a program using functions to print the following pattern(first n lines).

package Chapter_5_practice_set;

import java.util.Scanner;

public class code3 {

    static int rec_sum(int n) {

        if (n == 1) {
            return n;
        } else {
            int sum = n + rec_sum(n - 1);
            return sum;
        }
    }

    static int fibo(int n) {

        if (n == 1)// element number (n1)
        {
            return 0;// fibo number
        } 
        else if (n == 2) // element number (n2)
        {
            return 1;// // fibo number
        } 
        else {
            int fibo = fibo(n - 1) + fibo(n - 2);
            return fibo;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        sc.close();

        int sum = rec_sum(n);
        System.out.println("nth sum is : " + sum);
        // 1 2 3 4 5
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ....
        
        System.out.print("Fibo series : 0 1 ");
        int fibo_element = fibo(n);
        System.out.println("nth fibo element is : " + fibo_element);
        
    }
}
