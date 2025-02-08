package u3practicekunal;
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
// Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class Practice2 {

    static void max(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            System.out.println("max is " + a);
        } else if (b > c && b > d) {
            System.out.println("max is " + b);
        } else if (c > d) {
            System.out.println("max is " + c);
        } else {
            System.out.println(d);
        }

    }
    static void min(int a, int b, int c, int d) {
        if (a < b && a < c && a < d) {
            System.out.println("min is " + a);
        } else if (b < c && b < d) {
            System.out.println("min is " + b);
        } else if (c < d) {
            System.out.println("min is " + c);
        } else {
            System.out.println(d);
        }

    }

    // vargs help to avoid use of method overloading you can have lot of parameter for inut
    
    static void max(int ...var){
        int max = 0;
        for (int i = 0; i < var.length; i++) {
            if (var[i] > max) {
                max = var[i];
            }
        }

        System.out.println(max);

    }
    static void sum(int ...var){
        int sum = 0;
        for (int i = 0; i < var.length; i++) {
            sum += var[i];
        }

        System.out.println(sum);

    }

    static boolean checkOddEven(int n){
        // if (n % 2 == 0) {
        //  System.out.println("even");   
        // }
        return n % 2 == 0;// if even true else false
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // max(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());// 4 para
        // min(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        // max(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt());// vargs

        // max(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());// you can select which one to run 4 para or vargs
       
       
        // sum(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt());// vargs

        System.out.println(checkOddEven(sc.nextInt()));

        
        sc.close();
    }
}
