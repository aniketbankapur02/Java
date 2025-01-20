// Online C compiler to run C program online
#include <stdio.h>
#include <stdlib.h>
int main() {
    // Write C code here
    int l = 1;
    int * m = &l;//compare like arr1 takes hexacoe here m takes address

    int ** k = &m;// arr2 // arr1 gave ref code to arr2 of heap here k took              // address of m
    printf("%d\n",*m);
    *k = (int*)calloc(1,sizeof(int));//k affected m by changing his address
    // compare arr2 cannot chanage ref code of arr1
    // bec there is no concept of dereferencing arr1 value
    // as address of arr1 is not given to arr2 we gave hexacode of heap object
    // arr2 will have new hexa code which points to new object in heap
    // without affecting arr1
    printf("%d\n",*m);//referencing calloc default value in heap from l to heap               // address
    /* due address thing m value ie address is completly affected ie changed from l's address to calloc address due to new allocation
    by k which is un intensitonal change of m by k
    this affecting thing will not happen to owner in java  due to pass by value of reference  in java reference code is of heap not of owner
    so in c case (k = &m)k is pointing to directly to m due to which k can easily change value of m ie address
    where in java case (arr2 = arr1) arr2 is not pointing to arr1 so reflection will not made ot arr1
    also this * is not there in java so it will not change heap hexacode 
    like pointer
    
    refer diagram in xplore notebook middle page in reverse order
    */
    // printf("%d",l);
    return 0;
}





