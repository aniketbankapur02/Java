package objectcloning;

import java.util.Arrays;

/*
 deep copy vs shallow copy 
 */
class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    Human(int age,String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3};
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone(); // to use parent properties use super
    }
    
}


public class Example3 {

    /*
    in clone is shallow copy 
    primities are copied 
    non primities points to same object so that it will be reflected       
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(22, "Aniket");
        Human h3 = (Human)h1.clone();

        System.out.println(h3.age + " " + h3.name);
        System.out.println(Arrays.toString(h3.arr));
         
        h3.arr[0] = 11111;//will be reflected to h1 as well as it is shallow copy
        System.out.println(h1.arr[0]);

        // in example 4 we do deep copy
    }
}
