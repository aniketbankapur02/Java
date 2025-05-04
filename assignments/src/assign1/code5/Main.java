package assign1.code5;

import java.util.Arrays;


// Sort an Array in Ascending and Descending Order
public class Main {
    static void sortAscending(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void sortDescending(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {6,5,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,6};

        sortAscending(arr1);
        sortDescending(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        
    }
}
