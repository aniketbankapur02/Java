package U1_basics;

public class u6_basics_if_loops {
    public static void main(String[] args) {
        int a = 1;
        if ( a == 1) {
            System.out.println("a == 1");
        }
        else if(a > 1){
System.out.println("a is > 1");
        }
        else{
            System.out.println("a < 1");
        }

        /*
         use while loop when you dont no number of iterations
         like in use in games
         ---------
         use for loop when you know number of iterations
         ------
         use do while when you want to skip 1 st iteration like in game 
         no condition for 1 st gameplay 
         */
        while (a < 5) {
            System.out.println(a);
            a++;
        }


        /*
        WAP for C to F

        F = (C * 9/5) + 32;

        */

        int c22 = 9/5;

        float C = 32.89f;

        float F = (C * 9.0f/5) + 32;
        /*
        int * (float / int) + int

        int * float + int (acc to rule 1 bigger * smaller -> smaller)
        
        result float
        
        */  

        double F1 = (C * 9.0f/5) + 32;// float is implcitly typecasted to double (smaler to bigger)
        double F2 = (C * 9.0/5) + 32;// default is double 
        double F3 = (C * 9/5) + 32;// even this works well bec of assotivity C is float and 9 is int
        // so float * int -> float
        // float / int -> float
        //flaot + int -> float 

        System.out.println(F);







    }
}
