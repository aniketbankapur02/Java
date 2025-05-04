package assign1.code10;

import java.util.Scanner;

// triangle check
public class Main {
     //Equilateral: All three sides are equal.
     static boolean checkEqui(int a,int b, int c){
        boolean check = true;
        if (a == b && b == c) { // no need of && a == c as first two condition are enough if a == b and b==c it say c == a
            // if (a == b && b == c && a == c) { 
            check = true;
        }else{
            check = false;
        }

        return check;
    }
    // Isosceles: Exactly two sides are equal. any two sides
    static boolean checkiso(int a,int b, int c){
        boolean check = true;
        if ((a == b) || (b == c) || (c == a) ) {
            check = true;
        }else{
            check = false;
        }

        return check;
    }
    // Scalene: All three sides are unequal.
    static boolean checkScalene(int a,int b, int c){
        boolean check = true;
        if (a != b && b != c && a != c) {
            check = true;
        }else{
            check = false;
        }

        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkEqui(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.println(checkiso(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.println(checkScalene(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        
        // System.out.println(checkEqui(3, 3, 3));
        // System.out.println(checkiso(3, 4, 4));
        // System.out.println(checkScalene(3,4 , 5));

        sc.close();
    }
}
