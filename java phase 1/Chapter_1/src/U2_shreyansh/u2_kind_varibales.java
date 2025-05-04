/*
 note deault values are only given for static and inctance vribale (obj.a)
 no default are given for local block method 
default values are given to those which are given stored in heap and method area
no default values for stack variables
 local array var does not has default values as storage is in stack
 its object is in heap it will have default value 

 Class_name ref_var; ref_var is local variable no default is given 

 default for static and instacnce are 
 0,0.0,000(char ),null for reference variable like ref_var,String and other reference varibles
 false

 in char null is 000;

 no default for stack storage(local variables)
 default value for heap and method area storage(static,instance,objects)
 */

package U2_shreyansh;


public class u2_kind_varibales {
    static int static_var1;
    static float static_var2;
    int a; // instance variable
float b ;
    u2_kind_varibales(int parameter_variable){ // value must be given during object creation
        b = parameter_variable;
    }

    int add(int parameter_variable1,int parameter_variable2){// value must be given during method calling
        return parameter_variable1 + parameter_variable2;
    }
    
    
    public static void main(String[] args) {

    u2_kind_varibales ref_var = new u2_kind_varibales(1);// ref_var is reference variable which stores hexa code of heap 
    System.out.println(ref_var.a);//   default value is printed

    int local_variable = 1; // as no feault for local variable so must assign
    int a = 1;//local varibal

    System.out.println(local_variable);// eroor if not initlized

    System.out.println(static_var2);

    int arr[] = new int[4];

    System.out.println(arr[0]);//default value of int array object in heap -> 0

    String arr2[] = new String[4];// string is class 

    System.out.println(arr2[0]);//default value of string array object in heap -> null

    u2_kind_varibales ref ;

    //System.out.println(ref);// error local varibale is not initialized

    int array[];// give null value for local variable in stack storage
    // System.out.println(array);// error local varibale is not initialized

        String string;
    //System.out.println(string);// error local varibale is not initialized


    
}
    
}
