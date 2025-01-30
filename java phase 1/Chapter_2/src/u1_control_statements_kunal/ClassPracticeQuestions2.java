package u1_control_statements_kunal;

import java.util.Scanner;

//Q2 : Alphabet case check 
// take input a char and check weather it is lower case or uppercase 
public class ClassPracticeQuestions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);// taking char at first index
        // this charAt is taking char according to  index

        // charAt retun type is char

        // char c = sc.next().trim().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println("Lower case");
        }else{
            System.out.println("Upper case");
        }
        // if (c >= 'A' && c <= 'Z') {
        //     System.out.println("Higher case");
        // }
    }
}
