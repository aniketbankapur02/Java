package college_package_example.ece_department;

import java.util.Scanner;
import java.lang.System;
public class Website {
    public static void main(String[] args) {
        System.out.println("hello thank you for taking admission in ece department");
        // System.out = null;
        System.out.println();

        Scanner ref_ver = new Scanner(System.in);

        System.out.println("Enter float :");
        System.out.println(ref_ver.nextFloat());
        // clean buffer as nextfloat leaves \n char(also next,nextInt,nextFloat) in buffer
        // due to this \n char nextLine will get his type of input ie \n from buffer only so nextLine mehod will not ask user for input
        // beahvior it will not ask user for input for user if print in code it direcly prints \n in console 
        System.out.println("Enter student 2 name :");
        System.out.println(ref_ver.nextLine());
    }
}
