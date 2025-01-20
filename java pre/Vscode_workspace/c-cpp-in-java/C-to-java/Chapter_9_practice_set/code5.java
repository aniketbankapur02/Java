//Write a program with a class representing a Complex number.
// Create an array of 5 complex numbers created in problem 5 and display them with the help of a display function.
// The values must be taken as an input from the user.

package Chapter_9_practice_set;

import java.util.Scanner;

class complex_no {
    float a;
    float b;

    complex_no(int a,int b){
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println(a +"+"+ b +"i");
    }
}
public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        complex_no ref[] = new complex_no[5];
        for (int i = 0; i < ref.length; i++) {
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            ref[i] = new complex_no(a, b);
        }

        for (int i = 0; i < ref.length; i++) {
            ref[i].display();
        }
    }
}
