package practice;
// two digit three digit four digit sum
import java.util.Scanner;

// 10 to 99
// 100 to 999
// 1000 to 9999
public class code2 {


    public static void oddSum(int[] arr){
        int twoDigit = 0;
        int threeDigit = 0;
        int fourDigit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10 && arr[i] <= 99) {
                twoDigit += arr[i];
            }
            if (arr[i] >= 100 && arr[i] <= 999) {
                threeDigit += arr[i];
            }
            if (arr[i] >= 1000 && arr[i] <= 9999) {
                fourDigit += arr[i];
            }
            
        }

        System.out.println("two digit sum : " + twoDigit);
        System.out.println("three digit sum : " + threeDigit);
        System.out.println("four digit sum : " + fourDigit);
        
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
