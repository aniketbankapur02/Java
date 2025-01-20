
//Accessing arrays using pointers we do this in c/c++ for arr to function for reflection in main
//Passing arrays to functions

// pointer concept we mostly use for reflection
// in array string structure objects value  to function reflection
// above thing is not possible in java so will do it internally by call by value of reference of object in java
package Chapter_7_practice_set;

public class code2 {

    static void arr_to_fun(int arr[]){
        // arr = new int[]{1,2,3,4,5}; allocate new object which will not affect array in main stack
        // we can chnage object by accesing object in heap
        // which will reflect in heap and whoever pointing to ot will get updated value

        // arr has copy of ref code given by array (given by heap to array)
        // which will lead to same pointing 
        arr[0] = 3;
        // obj[0]  is updated in heap
        // as array is pointing to it will get that
        // arr makes new allocation of object 
        // it wont affect array as arr is poinitng to new object and array still pointing to old array object
        // if address of array was given to arr array would have affected 

    
    }
    static void arr_to_fun2(int arr[]){
        arr = new int[]{100,2,3,4,5};// allocate new object which will not affect array in main stack


    
    }
    public static void main(String[] args) {
        int array[] = new int[4];
        //   ref_var (arr)    obj allocation in heap
        // ref_var is like pointer in java

        // we will access in using ref_var

        
        array[0] = 1;
        System.out.println(array[0]);//1
        arr_to_fun(array);
        System.out.println(array[0]);//3


        System.out.println(array[0]);//3
        arr_to_fun2(array);
        System.out.println(array[0]);//3
         

    }
}
