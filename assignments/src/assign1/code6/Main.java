package assign1.code6;


// rotateLeft
public class Main {
    public static void rotateLeft(int[] arr, int positions) {
        for (int i = 0; i < positions; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int positions = 1;

        rotateLeft(array, positions);

        System.out.print("Rotated Array: ");
        for (int i : array)
            System.out.print(i + " ");
    }
}
