import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class U1Operation {

    /*
    Streams operation 
    filter 
    */
    public static void main(String[] args) {
        // filter even numbers
        // collection  : list (convert)-> stream (convert via collector)->List
        // predicate is arg where you have to give condition

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);

        List<Integer> filteredList = list1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(filteredList);


        // map values ie to convert
        // function is arg where you have to give and it returns something that changes
        List<Integer> mappedList = list1.stream().map(x -> x/2).collect(Collectors.toList());
        System.out.println(mappedList);


        //combine
        List<Integer> filteredMappedList = list1.stream().filter(n -> n % 2 == 0).map(x -> x / 2).collect(Collectors.toList());
        System.out.println(filteredMappedList);

        //distinct
        List<Integer> filteredMappedDistictList = list1.stream().filter(n -> n % 2 == 0).map(x -> x / 2).distinct().collect(Collectors.toList());
        System.out.println(filteredMappedDistictList);
        
        //sorted
        List<Integer> l1 = list1.stream().filter(n -> n % 2 == 0).map(x -> x / 2).distinct().sorted((a,b) -> (b - a)).collect(Collectors.toList());
        System.out.println(l1);

        // limit 
        List<Integer> l2 = list1.stream().filter(n -> n % 2 == 0).map(x -> x / 2).distinct().sorted((a,b) -> (b - a)).limit(2).collect(Collectors.toList());
        System.out.println(l2);

        //skip
        List<Integer> l3 = list1.stream().filter(n -> n % 2 == 0).map(x -> x / 2).distinct().sorted((a,b) -> (b - a)).limit(2).skip(1).collect(Collectors.toList());
        System.out.println(l3);

    }
}
