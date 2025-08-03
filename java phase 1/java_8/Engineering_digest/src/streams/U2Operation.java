import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class U2Operation {

    /*
    Streams operation 
    filter 
    */
    public static void main(String[] args) {
        // List<Integer> l1 = Stream.iterate(0,x -> x + 1)
        // .limit(101)
        // .skip(1)
        // .filter(x -> x % 2 == 0)
        // .map(x -> x/10)
        // .distinct()
        // .sorted()
        // .peek(x -> System.out.print(x + " "))
        // .collect(Collectors.toList());



        // max and min
Integer i = Stream.iterate(0,x -> x + 1)
        .limit(101)
        .map(x -> x/20)
        .distinct()
        .peek(x -> System.out.print(x + " ")).max((a,b) -> (b - a)).get();
        // a - b gives max values 
        // b - a gives min values


        System.out.println();

        System.out.println(i);
    
        System.out.println();


        
    Integer j = Stream.iterate(0,x -> x + 1)
        .limit(101)
        .map(x -> x/20)
        .distinct()
        .peek(x -> System.out.print(x + " ")).min((a,b) -> (a - b)).get();
        // a - b gives min values 
        // b - a gives max values

        
        System.out.println();

        System.out.println(j);

System.out.println();

        //count
        Long k = Stream.iterate(0,x -> x + 1)
        .limit(101)
        .map(x -> x/20)
        .distinct()
        .peek(x -> System.out.print(x + " ")).count();
        
        System.out.println();

        System.out.println(k);
    
    }
}
