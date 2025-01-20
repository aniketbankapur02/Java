/*
   *                                              
  ***                                             
 *****                                            
*******   

*/


// make class of star pattern of n field and diff pattern method
// its like making pattern for individual objects
// person1.zpattern 
// person1.starpattern 
// you can make normal method if not for individual person
// make static mehtod 
package Chapter_5_practice_set;

import java.util.Scanner;

public class code6 {
    static void pyramid_pattern(int n){
        int k = (n + n) - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if((j >= (k/2) - i) && (j <= (k/2) + i)  ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pyramid_pattern(sc.nextInt());
        sc.close();
    }

}
