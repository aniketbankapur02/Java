package U1_basics_kunal;

/*
 identifiers are the varibale name class name method name 
 literal/constants  are the values like 10,1.1, string literals -> "aniket". char literal 'a' 
 */


 /*
  Importing Scanner Class:
‘To use the Scanner we need to import the Scanner class from the util package as

import java.util.Scanner;  
Inbuilt Scanner functions are as follows:
Integer: nextInt()
Float: nextFloat()
String : next() and nextLine()

nextINt,float and next always leaves \n in buffer which is input for nextLine
so alaways clean buffer after nextINt,float and next if use nextLine as next input you can use nextLine to clean then use normal nextline input 

  */

import java.util.Scanner;

// wap for taing int input
public class u3_input_programs {
    public static void main(String[] args) { // static memeber of class
        Scanner sc = new Scanner(System.in);// .in means null ie to read input from keyboard read from documentation as well
// program to take int input
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.println(a);

        //----------------------------- program to take String and input
        // always clean buffer when next input is is of nextLine
        // if next input is next() it is fine bec next() cannot take \n
        // nextLine takes \n so clean buffer  
        System.out.print("Enter the name : ");
        String name = sc.next();
        System.out.println(name);

        //----------------------------------- program to take String and full sentence input
        sc.nextLine(); //nextLine is method which has return type due to which nextLine stores something
        // here nextLine takes \n of buffer
        // but next() cannot takes \n due which we write nextLine(); to take \n 
        // always clean buffer when next input is is of nextLine
        // if next input is next() it is fine bec next() cannot take \n
        // nextLine takes \n so clean buffer  
        System.out.print("Enter the full name : ");
        String full_name = sc.nextLine();

        System.out.println(full_name);
        System.out.print("Enter the decimal number : ");
        float num = sc.nextFloat();
    
        System.out.println(num);
    
    
    
    }
}
