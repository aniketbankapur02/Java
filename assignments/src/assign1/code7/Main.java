package assign1.code7;

// second largest
public class Main {
    public static void secondLargest(int[] arr) {
        int max1;
        int max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        System.out.println("Second largest : " + max2);

    }

    public static void main(String[] args) {
        int[] array = {1, 22, 3, 44, 5};
        secondLargest(array);

    }
}
