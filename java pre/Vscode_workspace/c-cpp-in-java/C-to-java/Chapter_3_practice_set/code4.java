//Write a program to determine whether a character entered by the user is lowercase or not
package Chapter_3_practice_set;

import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
             System.out.println("Enter the char :");
            Scanner sc = new Scanner(System.in);
            

              
            
            char alphabet2;


            alphabet2  = sc.next().charAt(0);
            sc.close();   

            if ((alphabet2 >= 'a') && (alphabet2 <= 'z')) {
                System.out.println("lower case");
            }
            else{
                System.out.println("not a lower case");
            }
    }
}

/* 
Scanner sc = new Scanner(System.in);
            
char alphabet;

alphabet  = sc.nextLine(System.in);
sc.close(); 

*/