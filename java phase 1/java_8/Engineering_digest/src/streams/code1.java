import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class streamJava{
    public static void main(String[] args){
        //imperative approach
        int[] arr = new int[]{1,2,3,4};
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum1 += 0;
            }
        }
    }

    //stream approach
    int[] array1 = new int[]{1,2,3,4};
    int sum2 = Arrays.stream(array1).filter(n -> n % 2 == 0).sum(); 

    //-------------to convert collection into stream

    List<String> list = Arrays.asList("Apple","Banana","cherry");

    // list.stream();
    // or
    Stream<String> myStream = list.stream();


    //-------------- how to make array into stream
    Integer[] array2 = new Integer[]{1,2,3,4};
    Stream<Integer> MyArrayStream = Arrays.stream(array2);

    //--------------- make stream directly from values

    Stream<Integer> integer = Stream.of(1,2,3);

    // setting integer values in range from 1 to 100

    Stream<Integer> s1 = Stream.iterate(0,n -> n + 1).limit(100);
    
    // stream of five hello string
    Stream<String> s2 = Stream.generate(() -> "hello").limit(5);

    // stream of five random variale
    Stream<Integer> s3 = Stream.generate(() -> (int)Math.random()).limit(5);

    
    


}