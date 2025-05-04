package assign1.code3;


// Copy Elements from One Array to Another
public class Main {
    static void copyArray(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        Main.copyArray(arr1, arr2);
    

        System.out.print("Copied Array: ");
        for (int num : arr2)
            System.out.print(num + " ");
    }
}
