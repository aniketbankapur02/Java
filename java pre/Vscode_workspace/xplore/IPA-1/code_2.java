/*

collection Arrays  in util
 string and array

 \'	'	Single quote
\"	"	Double quote
\\	\	Backslash

String txt = "We are the so-called \"Vikings\" from the north.";
String txt = "It\'s alright.";


Use Arrays.sort(arr); to sort in ascending order.
For descending order, use Arrays.sort(arr, Collections.reverseOrder());.
 */
import java.util.*;

public class code_2 {
    public static void main(String[] args) { // public removed it becames package private so JVM will not able to access it if statics removed jvm has to make object so static is imp for convinance it is standard and fix main signature
        
  String str = "aniket";

  System.out.println(str.length());
  System.out.println(str.toUpperCase());// not storing
  System.out.println(str.toLowerCase());
  System.out.println(str.indexOf("i"));
  System.out.println(str.concat("Bankapur"));
  System.out.println(str.equals("Bankapur"));
  System.out.println(str.substring(2,4));//slice
  System.out.println(str.charAt(2));

  String original = "Hello World";
String reversed = "";
// reverse traversing to get char in revserse and storing it 
for (int i = original.length() - 1; i >= 0; i--) {
    reversed += original.charAt(i); // we can append two strings via + operator 
    // H
    // H + e -> He
    // He + l -> Hel
    // and so on
    
}
// for (int i = original.length() - 1; i >= 0; i--) {
    // reversed += original[i]; not possible as it String not char array 
    
// }
System.out.println(reversed);
  int arr[] = new int[4];
  int ref_var[] = new int[4];


  //acess
  arr[0] = 10;
  arr[1] = 20;
  arr[2] = 30;
  arr[3] = 40;
  

  int arr1[] = {1,2,3,4};//arr is ref vari [] is like a class you can use methods of this array class arr.length
  // int is helpfull for both for primities types as well as for object type
  int ref_var1[] = new int[]{1,2,3,4};



//   int n = arr1.length;
// for(int i = 0; i< n;i++){
//     System.out.println(arr[i]);
// }

// int max;
// for(int i = 0; i< arr.length;i++){
//     //int  max ; // int max not good as it is local and it will erased after for loop } frame
//     if(arr[i] > max)
//     max = arr[i];

// }
// System.out.println(max);
int max = 0;
for(int i = 0; i< arr.length;i++){
    //int  max ; // int max not good as it is local and it will erased after for loop } frame
    if(arr[i] > max)
    max = arr[i];

}
System.out.println(max);

/*
 there are methods for string class 
 but array is not class it is int type 
 so they  made Arrays class which they have static method
 */
 Arrays.sort(arr) ; 

for(int i = 0; i< arr.length;i++){
    System.out.println(arr[i]);
}

/*
 Integer is int wrapper class 
 local int is stored in stack 
 so if we want primitives to be stored in heap we can do that via wrapper class
 int -> Integer
 collection works with heap object only we cannot use int we have to use wrapper class only
 also it is help full in pass by value reflection
 as in java reflection can be done via heap only using wrapper class we can pass local wrapper class to functions
 as allocation is in heap it reflection can be done like whoever poiting to heap will have updated heap

 so when you whan to so reflection and working with collection use wrapper class
 */

 Integer arr2[] = new Integer[]{1,2,3,4};//now type is INteger class is array
 Arrays.sort(arr2,Collections.reverseOrder()) ; 

 for(int i = 0; i< arr2.length;i++){
    System.out.println(arr2[i]);
}
int number = Math.max(5, 10);

System.out.println(number);

    String array[] = new String[4];

    array[1] = "sdfdf";
    array[2] = "sdfdf";
    array[3] = "sdfdf";


    System.out.println(array[1]);
    //or
    // String string1[] = {"sdfdf","sdfsdfs"};

// 2D array

 int arr_2D[][] = new int[10][20];

    }
}
