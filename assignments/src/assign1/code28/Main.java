package assign1.code28;



/*
 Write a method that accepts an array of integers and returns the median.

 */
public class Main {
    static double findMedian(int[] arr) {
        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n/2];
        }
        else {
            return (arr[n/2] + arr[n/2 - 1])/2.0;
        }
        
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3,1, 6};
        System.out.println("Median: " + findMedian(numbers));

     }
}