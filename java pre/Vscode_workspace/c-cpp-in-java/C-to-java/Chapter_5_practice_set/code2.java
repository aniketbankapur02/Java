//Write a program using functions to find the average of three numbers.
//Write a function to convert Celcius temperature into Fahrenheit.
//Write a function to calculate the force of attraction on a body of mass m exerted by earth. (g=9.8m/S2)
//Write a program using recursion to calculate the nth element of the Fibonacci series.
package Chapter_5_practice_set;

import java.util.Scanner;

public class code2 {
    
    static void avg_num(int num1,int num2,int num3){

        float avg = ((float)(num1 + num2 + num3))/3;
System.out.println(avg);
    }
    
  

    static void C_to_F(int C){
        float F = (C * (float)9/5 ) + 32;
        System.out.println(F);
    }
    static void force_mass(int mass){
        double g = 9.8;
        double F = mass * g;
        System.out.println(F);
    }
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 
    static int fibo(int n){
        int n1 = 0;
        int n2 = 1;
        int f = 0;

        System.out.print("Fibo series : "+n1+" "+n2+" ");
        for (int i = 0; i < n - 2; i++) {
            
            f = n1 + n2;
            n1 = n2;
            n2 = f;

            System.out.print(" "+f+" ");
        }
        System.out.println();

        return f;
    }

    
    public static void main(String[] args) {
        avg_num(1, 2, 3);
        C_to_F(32);

        // mass should be in KG
        force_mass(1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to get n th fibo number");
        int n = sc.nextInt();
        sc.close();
     int fibo_element =  fibo(n);
     System.out.println("nth fibo element is : "+fibo_element);


     int a = 1;
     System.out.println(a + ++a + a++);
     // 1 + 2 + 2 = 5
    }
}
