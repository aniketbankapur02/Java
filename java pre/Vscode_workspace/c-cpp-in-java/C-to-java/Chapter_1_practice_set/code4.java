// Q3. Write a program to convert Celsius (Centigrade degrees temperature to Fahrenheit)
// type casting is imp

// f = (c + 9/5) * 32

// C = (f - 32)/5/9
// 1) no execution in class only template making
//2) non staic members are not allowed in static
//3) access control will allow only using of template.The declared local refernce varibale cannot be accessed due to scope concept so it is not possible 

package Chapter_1_practice_set;

import java.util.Scanner;

public class code4 {
    
    static void C_to_F(int C){

        // float F;
        double F;
        F = (C * (float)9/5) + 32;
        // F = (C * 9.0/5) + 32; // by default return  type is double due ot precision loss of decimal numer due to loss of bits
        F = ((C * 9.0/5) + 32); //float stores bits in limited form due to this his limited space 32 bits to avoid precision loss use douuble which has 64 bit of capacity to store due this precision loss will not happens when you do recursive type summation 
        System.out.println("F"+F);
    }
    
    static void F_to_C(double F){

        // double C ;
        int C ;
        C = (int)((F - 32) * 5.0/9);
  
        C = (int)((F - 32) * ((double)5)/9);
        
        System.out.println("C"+ C);
    }

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

     
            double F;
            int C;
         
            System.out.println("Enter F and C");
            F = sc.nextDouble();
            C = sc.nextInt();

            sc.close();

            F_to_C(F);
            C_to_F(C);
    }
}
