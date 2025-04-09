package generics;

import java.util.ArrayList;
import java.util.Arrays;

// we have to implement his features like resize when it is near to full
// add method
// remove method

 class CustomArrayList{

    private final static int DEFAULT_SIZE = 10;
    private int[] data;
    private int size = 0;// also act as index

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private Boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        // make new array
        int temp[] = new int[2*size];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];// copy element to new element
        }
        // transfer element to old
        data = temp;
    }
   public int remove(int num){
        int remove = data[--size];// size is reduced but element remains in array when you add new element that array element is overrided and replaced by new
        return remove;
    }
   public int get(int index){
        return data[index];
    }

   public int size(){
        return size;
    }
   public void set(int index,int value){
    data[index] = value;
   }

   @Override
   public String toString() {
       return "{data = " + Arrays.toString(data) + ", size = " + size + "}";
   }

}

public class Main1 {
    public static void main(String[] args) {
        CustomArrayList arr = new CustomArrayList();
        arr.add(1);
        arr.add(1);
        System.out.println(arr.toString());
        System.out.println(arr.size());

        arr.add(3);
     
        arr.remove(1);
        System.out.println(arr.toString());
        System.out.println(arr.size());
        arr.add(2);// you can see 2 is removed 
        System.out.println(arr.toString());
        System.out.println(arr.size());

        /*
         size is used element of ArrayList
         actual size grows as per demand
         */

        //  ArrayList<T> list = new ArrayList<T>()
        // <> is generics so custom type has to define at compile time only 
        
        // so we have to use another approach to make cusotm type via generics
    }
}

