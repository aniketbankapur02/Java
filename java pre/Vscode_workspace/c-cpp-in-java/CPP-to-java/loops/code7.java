//-Binary Number System 

/*
 1:40 Binary no. System
5:10 Decimal  to   Binary
6:59   Binary    to   Decimal
 */
package loops;

import java.util.Scanner;

public class code7 {
    static int binary_decimal(int binary){
        int decimal;
        decimal = 0;
        int rev = 0;
        int counter = 0;//index
        while (binary > 0) {
            rev = binary % 10;
            decimal = decimal + rev * (int)(Math.round(Math.pow(2,counter)));// why typecast bec decimal is in int
            
            
            counter++; 
            binary /=10;
        }
        
        return decimal;
    }
    // D -> dividend
    // d -> divisor (2) 
    // Q -> quotient
    // r -> reminder
    static long decimal_binary(int decimal){
        int D = decimal;
        int Q = 0;
        long rev = 1;
        // int counter = 0;
        // if (D == 0) { edge case for zero
        //     return 0;
        // }
        while (Q != 1 && D != 0) { // D != 0 edge case for zero
            
            int R = D % 2;
            if (R == 0) {
                rev = rev * 10;    
            }else{
                rev = (rev * 10) +  R;
            }
            Q = (D-R)/2;
            D = Q;
        }
        if(D != 0) // edge case for zero
            rev = (rev * 10) +  1;//last factor
        // System.out.println(rev);

        long binary = 0;
        while (rev > 0) {
            
            binary = binary * 10 + rev%10;
            rev /= 10; 
        }

        // System.out.println(binary);
        binary /=10;//remove 1 that holed initial zeros
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
    //  int k = binary_decimal(n);
    //  System.out.println(k);
    long l = decimal_binary(n);
     System.out.println(l);
    }
}

/*
 // C program for converstion and return in string
#include <stdio.h>
#include <stdlib.h>
char* baseNeg2(int decimal) {
    
     int D = decimal;
        int Q = 0;
        long rev = 1;
        // int counter = 0;
        // if (D == 0) { edge case for zero
        //     return 0;
        // }
        while (Q != 1 && D != 0) { // D != 0 edge case for zero
            
            int R = D % 2;
            if (R == 0) {
                rev = rev * 10;    
            }else{
                rev = (rev * 10) +  R;
            }
            Q = (D-R)/2;
            D = Q;
        }
        if(D != 0) // edge case for zero
            rev = (rev * 10) +  1;//last factor
        // System.out.println(rev);

        long binary = 0;
        while (rev > 0) {
            
            binary = binary * 10 + rev%10;
            rev /= 10; 
        }

        // System.out.println(binary);
        binary /=10;
// printf("%d",binary);
    int i = binary;
    int counter = 0;
    while(i != 0){
        counter++;
        i /= 10;
    }
    // printf("%d",counter);
    char* str = (char*)calloc(counter + 1,sizeof(char));//one extra for null character

        str[counter] = '\0';
        if(decimal == 0){
            // str = "0";
            return str;
        }
        // str[0] = '1';
        // printf("%s",str);
        for(int i = counter - 1; i != -1;i--){
            int n = binary % 10;
            if(n == 0 ){
                str[i] = '0';
            }else{
                str[i] = '1';
            }
            binary = binary/10;
        }

        return str;
}

int main() {
    // Write C code her
    int i;

    scanf("%d",&i);
    char* c = baseNeg2(i);
    printf("%s",c);
    free(c);

    return 0;
}






 */
