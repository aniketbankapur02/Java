package u1_control_statements_kunal;

import java.util.Scanner;
//Q1 : Largest number
// find largest among three already done using ternary and if else 
// we use diff appraoch now
public class ClassPracticeQuestions1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers :");

        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
        int num4 =sc.nextInt();

        int max = 0;
        // it is for array which we do in loop
        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
            
        }
        if (num3 > max) {
            max = num3;
            
        }
        if (num4 > max) {
            max = num4;
            
        }

        System.out.println(max);

        // anaother approach
max = 0;
        max = Math.max(num1, num2);
        max = Math.max(max, num3);
        max = Math.max(max, num4);

        System.out.println(max);


        max = 0;


        max = Math.max(num4,Math.max(num3,Math.max(num1, num2)));
System.out.println(max);

        sc.close();
    }    
}
