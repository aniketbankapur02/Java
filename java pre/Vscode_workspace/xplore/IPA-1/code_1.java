/*
Importing Scanner Class:
‘To use the Scanner we need to import the Scanner class from the util package as

import java.util.Scanner;  
Inbuilt Scanner functions are as follows:
Integer: nextInt()
Float: nextFloat()
String : next() and nextLine()

 */

import java.util.*;

public class code_1 {
    public static void main(String[] args) {
        Scanner ref_var = new Scanner(System.in);

        String name;
        String  Full_name;


        System.out.println("Enter your name");
        name = ref_var.next();// consuming from input buffer not from input buffer and storing
        // input by user first goes in input buffer and next() n other methods takes input from input buffer
        // if they found thier input like Int founds 1 it takes that 
        

        /*
         1 //input
1 //output
11.11//input
11.11//output

1 11.11 // input

11.11 // here nextFloat wont ask for input for user as it checks first in input buffer for float number if he founds there it will take from there and will not ask user if not in input buffer he will for user so clean/flush input buffer if unexpected behavior is made mostly it happens in string refer above case for next and nextline thing
//output
1 
11.11
         */
        System.out.println(name);


         // Consume the leftover newline from the previous next() call
         ref_var.nextLine();
         // consuimg and not stroing

         //Even if string is one always use nextLine 
        System.out.println("Enter your full name");
        Full_name = ref_var.nextLine();
        System.out.println(Full_name);

        int num;
        float decimal_number;

        System.out.println("Enter your num and decimal number");
        num = ref_var.nextInt();
        System.out.println(num);
        decimal_number = ref_var.nextFloat();
        System.out.println(decimal_number);

    
    }
}
