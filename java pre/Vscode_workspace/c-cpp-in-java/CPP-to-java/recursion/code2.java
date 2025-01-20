/*


//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****
//    ***
//     *

n = 5 
range i row -> n*2
      j  col -> n + n - 1

    so make n*2 row frames
    and each row frame will make (n + n - 1) col frames 

    need to make row funtion
    col function

    row function will make row frames calls  
    col function will make col frames calls  

*/


package recursion;

import java.util.Scanner;

public class code2 {

    static void col_frames(int k,int l,int i ,int j){
        // System.out.print(l+k+i+j);
        if (j == -1) {
            return ;
        }
        if(i < l/2){
            if ((j >= (k/2) - i) && (j <= (k/2) + i)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            }
            else{//          -             i                               +                 i
            if ((j >= ((k/2) - (i - ((i - (l/2))*2 + 1)))) && (j <= ((k/2) + (i - ((i - (l/2))*2 + 1))))) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
           }
        col_frames(k,l, i, j-1);
    }
    static void row_frames(int k,int l,int i,int j){
    
        if (i == -1) {
            return ;
        }
        row_frames(k,l,i-1,j);// for n = 5 10 frames will be made
        col_frames(k,l,i,j);// each col will print its star (this work work after 11 frame of row is return for i = -1)
        System.out.println();

    }

    static void star_pattern(int n){
        int l = n*2;
        int k = n + n - 1;
        int i = l;
        int j = k;

        row_frames(k,l,i,j);
        // col_frames(k,i,j);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        star_pattern(n);
    }
}
