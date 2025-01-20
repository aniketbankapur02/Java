/*

*
 
***
 
*****

*/

package Chapter_5_practice_set;

import java.util.Scanner;

public class code8 {
    static void pyramid_pattern(int n) {
  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i*2 + 1) ; j++) {
                System.out.print("*");
            }

            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pyramid_pattern(sc.nextInt());
        sc.close();
    }

}