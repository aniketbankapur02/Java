package u2practiceset.practiceset1.charry;
/*
 Write your own version of strcpy function from <string.h>

 read and write is easy to array,stringbuilder,stringbuffer
 only read can done to string we cannot write srting ie we cannot do changes to string 

 */

import java.util.Arrays;
import java.util.Scanner;

/*
         String str = "hello";
       System.out.println(str.length());
       System.out.println(str.toUpperCase());// not storing
       System.out.println(str.toLowerCase());
       System.out.println(str.indexOf("l"));
       System.out.println(str.concat("Bankapur"));
       System.out.println(str.equals("Bankapur"));
       System.out.println(str.substring(2,4));//slice
       System.out.println(str.charAt(0));

       ---

       System.out.println(name.toString());// string to string
       /*
       in below method first we are converting each string element to char array element
       and again converting char array to string for proper printing
       
       System.out.println(Arrays.toString(name.toCharArray()));
       System.out.println(name.toLowerCase());
       System.out.println(name);
       System.out.println(name.indexOf('a'));
       System.out.println("     Kunal   ".strip());// removes spaces
       /*
        in below method we making string arrry for every space we are making string and storing it in array
        and making it to string array to string for proper printing 
        
       System.out.println(Arrays.toString(name.split(" ")));
       System.out.println(Arrays.toString(name.split("l")));
       // string array for every l
       //[Kuna,  Kushwaha He, , o Wor, d]
       // you can see from l  it is splitted ad spaces are counted for string
       //kushwa to he
       // o to wor
       // space and l at last

 */
public class Practice5 {
    static StringBuilder myToUpperCase(String s) {
        StringBuilder s1 = new StringBuilder(s);
        for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                s1.setCharAt(i, (char) (s1.charAt(i) - 32));
            }
        }
        return s1;
    }
    static StringBuilder myToLowerCase(String s) {
        StringBuilder s1 = new StringBuilder(s);
        for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
                s1.setCharAt(i, (char) (s1.charAt(i) + 32));
            }
        }
        return s1;
    }
    static int myindexOf(String s,String c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c.charAt(0)) {
                return i;
            }
        }
        return -1;// if not found
    }
    static char mycharAt(String s,int i) {
        char[] arr = s.toCharArray();
        return arr[i];
    }
/*
 not to worry if you are passing string and returning stringbuilder
 anyway string wont be edit are as thery are immutable we can only allocate new once
 so appending each time means we are making new object each time so we have to make stringbuilder for actual modifying 
 */
    static String myCopystr(String s2) {
        StringBuilder s3 = new StringBuilder();// default capaacity is 16 it grows when size becomes half of capacity 

        for (int i = 0; i < s2.length(); i++) {
            // s3.setCharAt(i, s2.charAt(i)); // gets error as string is empty it throws indexoutofbound error when index == length as index is 0 and length is zero you get this error as set work for replace only as it is empty string you wont able to access so it will lead indexoutofbound error 
            s3.append(s2.charAt(i));
        }

        // String s = s1 + "";// type case
        return s3 + "";// typecast for easy converstion from string builder to string or use toString method 
    }

    static char[] myToCharArray(String s){//no void as we cannot reflect to string we have to return array only then assign to array or directly print it
        // s.toCharArray();

        char[] arr = new char[1024]; 

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        return arr;
    }

    // tostring method is overloaded with diff diff parameters with respective to args converstion logic
    // arg can char, int, string array
    // i taking char array as args and i will convert char arra to string
    static String myToString(char[] arr){
        // edge cases
        if (arr == null) { // null case
            return null;
        }
        if (arr.length == 0) { // empty case
            return "[]";
        }
        StringBuilder s1 = new StringBuilder();// why SB bec of performance will be improvements as no new object is made for every append 

        s1.append('[');
        for (int i = 0; i < arr.length; i++) {
            // s1 = s1 + arr[i];
            s1.append((arr[i]));// here no new object is made here original string is modified
            
            // clean code
            if (i == arr.length - 1) // if reachs end append only ] not , and space
              return  s1.append(']') + ""; // use "" or tostring to convert SB to string
            s1.append(", ");// appending string to string builder but this wont convert SB to string as it not + thing
            
            // if (i == arr.length - 1) { // if reachs end append only ] not , and space
            //     s1.append(']');
            // }else{
            //     s1.append(',');
            //     s1.append(' ');
            // }
        }
        
        // s1.append('[');
        // for (int i = 0; i < arr.length; i++) {
        //     // s1 = s1 + arr[i];
        //     s1.append((arr[i]));// here no new object is made here original string is modified
        //     s1.append(',');
        //     s1.append(' ');
        // }
        // s1.deleteCharAt(s1.length() - 1);// as index = element - 1; here after cut [a, n, i, k, e, t,
        // s1.deleteCharAt(s1.length() - 1);// now last element is , so here after cut [a, n, i, k, e, t if - 2 then [a, n, i, k, e, , as now second last element is t not , as above space is removed so second last is not , 
        // s1.append(']');// at end append ]
        
        // s1.append("[");
        // for (int i = 0; i < arr.length; i++) {
        //     // s1 = s1 + arr[i];
        //     s1.append(arr[i] + ", ");// here no new object is made here original string is modified
        // }
        // // s1.deleteCharAt(s1.length() - 1);
        // System.out.println(s1.length());
        // s1.delete(s1.length() - 2, s1.length());//s1.length() - 2 cuts , and s1.length() cuts space of ", " 
        // s1.append("]");// at end append ]
        return s1 + ""; //typecast for string converstion or use to string to convert SB to string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // System.out.println(myToUpperCase(sc.next()));
        // System.out.println(myToLowerCase(sc.next()));
        // System.out.println(myindexOf(sc.next(), sc.next()));
        // System.out.println(mycharAt(sc.next(), 3));

        // String s1 = "Hello";
        // String s2 = myCopystr(s1);
        // System.out.println(s2);

        char[] arr = new char[]{'a','n','i','k','e','t'};
       String s1 =  Arrays.toString(arr);
        String s = myToString(arr); 
        System.out.println(s + "<-->" + s1);



        sc.close();
    }
}
