package U1_basics;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        //output
        System.out.println("hello");
        
        // input
        Scanner ref_ver = new Scanner(System.in);
        System.out.println("Enter float :");
        System.out.println(ref_ver.nextFloat());
        // clean buffer as nextfloat leaves \n char(also next,nextInt,nextFloat methods) in buffer
        // due to this \n char nextLine will get his type of input ie \n from buffer only so nextLine mehod will not ask user for input
        // beahvior it will not ask user for input for user if print in code it direcly prints \n in console 
        System.out.println("Enter student 2 name :");
        System.out.println(ref_ver.nextLine());

        /*
         next(); for one string till space
         nextLine(); for whole line
         nextInt();for int
         nextFloat();for float
         */

    }
}
