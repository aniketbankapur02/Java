package objectcloning;

import java.util.Arrays;

/*
 deep copy 
 */
class Human implements Cloneable{
    int age;
    StringBuilder name;
    int[] arr;

    Human(int age,StringBuilder name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3};
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {

        // return super.clone(); // to use parent properties use super

        Human h3 = (Human)super.clone();// shallow copy

        // deep copy
        h3.arr = new int[h3.arr.length];

        for (int index = 0; index < h3.arr.length; index++) {
            h3.arr[index] = this.arr[index]; 
        }

        return h3;


    }
    
}


public class Example4 {

    /*
    in clone is shallow copy 
    primities are copied 
    non primities points to same object so that it will be reflected       
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(22, new StringBuilder("Aniket"));
        Human h3 = (Human)h1.clone();

        System.out.println(h3.age + " " + h3.name);
        System.out.println(Arrays.toString(h3.arr));
         
        h3.arr[0] = 11111;//will be not reflected to h1 as well as it is deep copy
        /*
         bec in shallow copy both h1 and h3 pointing to same object so any chanegs by h3 in non primitives will be reflected to h1 as well
         after deep copy same object is not copyied 
         */
        System.out.println(h3.arr[0]);
        System.out.println(h1.arr[0]);// h1 is not effected like what happened in example 3 due to deep copy 


        // simmilar deep copy logic should be written for String builder as well as both h1 and h3 are pointing to same object string in heap any changes made by string h3 will be reflected to heap and whoever pointing to same object in heap will have that object
        h3.name.append(0);
        System.out.println(h3.name);
        System.out.println(h1.name);


    }
}
