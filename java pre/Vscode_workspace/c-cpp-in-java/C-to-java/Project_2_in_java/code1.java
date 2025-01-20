// Project 2: rock, paper, scissor
package Project_2_in_java;

import java.util.Scanner;

public class code1 {

    static int result(char p, char c) {

        if (p == 'r' && c == 'r') {
            return 0;
        } else if (p == 'r' && c == 'p') {
            return -1;
        } else if (p == 'r' && c == 's'){
            return 1;
        } else if (p == 'p' && c == 'r') {
            return 1;
        } else if (p == 'p' && c == 'p') {
            return 0;
        } else if (p == 'p' && c == 's') {
            return -1;
        } else if (p == 's' && c == 'r') {
            return -1;
        } else if (p == 's' && c == 'p') {
            return 1;
        } 
        // else if (p == 's' && c == 's') {
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int random_num = ((int) (Math.random() * 100) + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice  rock 'r', paper 'p', scissor 's'");
        char p = sc.next().charAt(0);
sc.close();
        char c;

        if (random_num > 0 && random_num <= 33) {
            c = 'r';
        } else if (random_num > 33 && random_num <= 66) {
            c = 'p';
        }
        // if(random_num > 66 && random_num <= 100)
        else {
            c = 's';
        }
        System.out.println(c);
        System.out.println(random_num);
        int k = result(p, c);

         if (k == 1) {
            System.out.println("you won");
        } else if (k == -1) {
            System.out.println("you lost");
        } 
        else{
            System.out.println("draw");
        }

    }
}
