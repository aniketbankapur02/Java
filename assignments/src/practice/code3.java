package practice;
import java.util.HashSet;
// count distinct element
import java.util.Scanner;


public class code2 {


    public static int distinct(int[] arr){
        

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }
        return set.size();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        oddSum(arr);

        sc.close();
    }
}
