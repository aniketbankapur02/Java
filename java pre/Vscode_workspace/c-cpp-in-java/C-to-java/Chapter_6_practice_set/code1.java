// Write a program to print the address of a variable. Use this address to get the value of this variable.
//  print reference code ie hexa code of heap

//2 Write a program having a variable i. Print the address of i. Pass this variable to a function and print its address. Are these addresses same? Why?
//3 Write a program to change the value of a variable to ten times its current value. Write a function and pass the value by reference.
// we do it by call by value of ref 


package Chapter_6_practice_set;

public class code1 {
    int a;

    static void change_10x(code1 ref){
        // ref is pointing to same heap obj what ref_var is pointing 
        // as heap give hash code to ref_var and same hash code is given to ref by ref_var
        // so both are pointing to same heap
        // you can chnage object by accesing obj feild 
        // after the change heap is updated and whoever pointing to heap we will get updated objects
        // this pass by value of reference wont affect ref_var ex ref makes new obj so this wont affect ref_var
        // ref will point to new obj and ref_var is still unchanged. if it was call by reference it would have affected ref_var  as address of ref_var given to ref so owner of address will be affected 
        ref.a = ref.a *10; 

    }
    public static void main(String[] args) {
        code1 ref_var = new code1();
        System.out.println(ref_var);
        
        ref_var.a = 10;

        System.out.println(ref_var.a);
        change_10x(ref_var);
        System.out.println(ref_var.a);
    }
    
}
