//Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.(Consider 8x1 to 8x10)

package Chapter_4_practice_set;

import java.util.Scanner;

public class code2 {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;

        for (int i = 1; i <= 10 ; i++) {
            sum = sum + n*i;
        }
        System.out.println(sum);
        
        //Write a program to calculate the factorial of a given number using for loop.

       
        int fac = 1;
        for (int i = 0; i < n ; i++) {
            fac =  fac * (n - i);
          
        }

        System.out.println(fac);
        //Repeat above using a while loop
        int i = 0; 
        int fac1 = 1;
        while (i < n) {
            fac1 = fac1 * (n - i);
            i++;
        }
        System.out.println(fac1);
        




}    
}
