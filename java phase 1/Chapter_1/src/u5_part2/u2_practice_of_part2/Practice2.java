package u5_part2.u2_practice_of_part2;
// Prints true only if both numbers entered are even.

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        // int b = (a % 2 == 0) ? System.out.println("even"); : a; // only expression are allowed  
        int b = (a % 2 == 0) ? 1 : 0; // if condition is true b is assigned to 1 if false it will be assigned to 0
        if (b == 1) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }


        sc.close();
    }    
}
