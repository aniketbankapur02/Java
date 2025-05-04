package assign1.code4;


// Remove Duplicate Elements
public class Main {
    static int[] removeDuplicate(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean dublicateExist = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    dublicateExist = true;
                }
            }
            if (!dublicateExist) {// if true will not add
                result[index++] = arr[i];
            }
        }

        // copy to new array to avoid zeros
        int[] finalArray = new int[index];

        for (int i = 0; i < index; i++) {
            finalArray[i] = result[i];
        }

        return finalArray;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2,2, 3, 4,4,4, 5,3,3};

        arr = Main.removeDuplicate(arr);

        System.out.print("After remove : ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
