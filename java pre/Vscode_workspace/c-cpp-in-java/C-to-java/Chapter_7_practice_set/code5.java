//Create an array of 10 numbers. Verify using pointer arithmetic that (ptr+2) points to the third element where ptr is a pointer pointing to the first element of the array.

/*      
  
#include <stdio.h>

int main() {
    // Write C code here
   int arr[3]= {1,2,3};
   
   int * ptr = arr;
   ptr = ptr + 2 ;
   printf("%d",*ptr);
 //  printf("%d",*(ptr + 2)); arr2 + 2
   
   return 0;
}

 */

package Chapter_7_practice_set;

class code5 {
    public static void main(String[] args) {
        
        int arr[] = new int[]{1,2,3};
        int arr2[] = arr;
        
        /*
           int arr[3]= {1,2,3};
   int * ptr = arr;
   ptr = ptr + 2 
   printf("%d",*ptr);  

   ptr is pointing to arr


   in java both arr and arr2 poinitng to heap 

         */
        System.out.println(arr2[2]);
    }
}