package u1classworkunal;
// dont use StringBuilder as class name as it is reservered 
public class U7StringBuilderClassWork {
    public static void main(String[] args) {
        /*
         to improve performance from O(n^2) to O(n) we have to modify string
         to modify we have to use string builder (not thread safe but good single thread application but it is fastest)
         or we can use string buffer thread safe good multi threaded application but little slower than String Builder

         */

        //  StringBuilder s1 = "hello"; error as hello is string(string pool) not stringbuilder 
         StringBuilder s2 = new StringBuilder("hello");// now it string builder not a string  
         StringBuffer s3 = new StringBuffer("hello");

         /*
          storage for StringBuilder and StringBuffer is in heap not in pool like string can be store in pool and in heap
          StringBuilder and StringBuffer cannot be stored in string pool as only string can be stored in pool only 
          */

        //   s2 = "hello"; not possible to do new for string
        // you can do new inilization for string builder only not string

/*
 string method you an explore via . also refer w3school and GPT
 */
// s2.
// s3.


    }
}
