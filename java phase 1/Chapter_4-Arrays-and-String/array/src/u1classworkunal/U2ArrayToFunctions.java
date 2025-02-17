package u1classworkunal;
/*
 array are objects so we have to pass value of reference code
 */
import java.util.Arrays;

public class U2ArrayToFunctions {
    static void change(String[] arr1){
        arr1[0] = "Hello";// arr1 accesing and changing the object via [] whichh is in heap
    }
    public static void main(String[] args) {
        String[] arr = {"hi","there"};


        System.out.println(Arrays.toString(arr));
        change(arr);// passing reference code
        System.out.println(Arrays.toString(arr));
    }
}
