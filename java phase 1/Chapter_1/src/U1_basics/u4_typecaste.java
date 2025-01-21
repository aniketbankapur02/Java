package U1_basics;
/*
1) implicit and 2) explicit type casting
3) automatic type promotion in expression
 */
import java.util.Scanner;

public class u4_typecaste {
    private static int i = 1;
    public static void main(String[] args) {
        i = 111;
        // never apply oops and use oops principles within same class
        // as private valuesa can be changes no security use of OOps

        Scanner sc = new Scanner(System.in);
        // float a = sc.nextInt();
//-----------------------1) implicit type casting----------------------------------------
        // case 1 for implicit
        // int a = 1.1; // error it connot convert
        //  a is desination and 1.1 is sources
        
        // case 2 for implicit
        float b = 1; // no error as it satisfy condition 1 and 2
        
        /*
        implicit type casting works under 2 condition
        1) desination should type should be grater than sources
        2) should be compatiblie ex float and int not string int or float

        in case 1 implicit is not wokring bec it fails condition 1
---
Implicit Typecasting (Widening or Automatic Conversion)
-Performed automatically by the compiler.
-Converts a smaller data type to a larger data type without data loss.
-Example: byte → short → int → long → float → double.
larger to smaller is not possible 
---
        */
//-----------------------2) explicit type casting----------------------------------------
        
        /*
        if you want to do type converstion from greater(float) to shorter(int)
        you can do only via explicitly 
        */

        // int a = (int)(1.1f);
        long a = (long)(1.1f);

        float any = (float) 1.1;

        int z = a * 4; // long * int (default is int) -> long
        // error cannot convert long to int (biger to shorter implicit type cast is not possible due to condtion not satisfied)

        long c = b * a;  // float * long -> float
        // error will occur as float to long implicit typecast is not possible bigger to smaller is not possible 

        int number = 256;

        //byte f = number; condition 1 (int(bigger) to byte(smaller) is not possible) is not satified so do explcit 

        byte f = (byte)number;
        /*
         but here byte size is of 8 bits therefore it can store  0 to 255
         so byte will cut off number greater than 256 by doing % via 256
         256 % 256 = 0
         257 % 256 = 1
         258 % 256 = 2
         */

         short s = 145;

         byte b3 = (byte)s;
         /*
          here the type converstion is of 145 short to byte 
          and byte cannot handle 145 as range is -128 to -1 and 0 to 127
          so byte will cut off 145 to -111 by narrowing
          steps
          1) convert 145 into bits
          145 = 10010001 in binary
          2) convert bits into byte format

          byte formate 1 sign bit and 7 data bit
          thats why combo is 2^7 0 to 127 and -1 to -128

          10010001 = 1  0010001 
              = -ve bit  7 bit data

          3) convert 7 bit data 0010001 to 2's compliment 
           0010001 -> 111 (2's compliment)

           or convert 10010001 into decimal and add sign acc to 1st bit 
           
           so final result is -111
          */



//-----------------------3) automatic type promotion in expression----------------------------------------

        
    /*
    note operatore can by *, /, +, - 
        automatic type promotion in expression more in GPT
        greater typecast * smaller typecast = greater typecast
        byte * byte -> int
        char * char -> int
        byte * int -> int
        int * long -> long
        float * int -> float
        long * float -> float
        double * float -> double 

        default is int and double

Rules of Automatic Type Promotion

1)Operands Are Promoted to the Same Type
If the operands in an expression have different data types, Java promotes the smaller data type to the larger data type.
Example: int + float → the int is promoted to float, and the result is of type float.

2)Data Types Smaller Than int Are Promoted to int
In arithmetic expressions, all byte, short, and char values are automatically promoted to int, even if no int values are involved in the expression.
Example: byte + byte → int.

why smaller than int to int bec byte * byte can easily exceed byte range to avoid cutoff 
java made  Automatic Type Promotion in expression only to avoid data loss

3)If One Operand Is a long, the Result Is long
Example: int + long → long.

4)If One Operand Is a float, the Result Is float
Example: int + float → float.

5)If One Operand Is a double, the Result Is double
Example: float + double → double.


         */

         byte p = 1;
         byte q = 1;
         byte r = 3;

         byte t = (p * q)/r;

         /*
          p * q -> 1
          so auto conversion type is byte * byte -> int
          so 1 will be in int type
          but int cannot be converted in byte due to condtion 1
          */




          long p3 = 1;
          long q3 = 1;
          long r3 = 3;
          
          int t3 = (p3 * q3);
            /*
          
           p1 * q1 -> 1
           long * long -> long
           but long connot be converted in int as it does not satisfies condtions
           greater to smaller implicit conversation is not possible
           */




          int p1 = 1;
          int q1 = 1;
          int r1 = 3;
          
          long t1 = (p1 * q1)/r1;
          
          /*
           p1 * q1 -> 1
           long * long -> long
         no error as t1 is in long it stores long
           */



          float p2 = 1.1f;
          float q2 = 1.1f;
          float r2 = 3;
          
          int t2 = (p2 * q2);
            /*
          
           p1 * q1 -> 1
           float * float -> float
           but float connot be converted in int as it does not satisfies condtions
           greater to smaller implicit conversation is not possible
           */


           int num1 = 1;
           float num2 = 1.1f;

           int num3 = num2/num1;

                       /*
          
           float (num2) / int (num1) -> float 
           error
           but float connot be converted in int as it does not satisfies condtions
           greater to smaller implicit conversation is not possible
           */
           int n1 = 1;
           float n2 = 1.1f;

           int n3 = n2 + n1;

                       /*
          
           float (n2) + int (n1) -> float 
           error
           but float connot be converted in int as it does not satisfies condtions
           greater to smaller implicit conversation is not possible
           */

           byte m1 = 40;
           byte m2 = 50;

           byte m3 = m1 * m2;

           /*
            why byte * byte -> int bec byte * byte can easily exceed in our case 2000 which exceeds byte range 
            so to avoid cutoff like 2000 % 256 
            java made Automatic Type Promotion in expression only to avoid data loss

            and also int cannot implcitly converted into byte bec of no condition satisfcation  
            */

            int character = 'A';

            System.out.println(character);
            // converstion from char to int

            /*
             Java follows Unicode

             */
            System.out.println("नमस्कार");

//--------------------Q to find cast of this expressiona and cast of bracket 1,2,3
            byte b1 = 42;
            char c1 = 'a';
            short s = 1024;
            int i = 50000;
            float f1 = 5.67f;
            double d = 0.1234;
            double result = (f1 * b1) + (i / c1) - (d * s);
            // float + int - double = double
            System.out.println((f1 * b) + " " + (i / c1) + " " + (d * s));
            System.out.println(result);
          
          


    }    
}
