//Create a three-dimensional array and print the address of its elements in increasing order.
// we will print ref_code
package Chapter_7_practice_set;

public class code11 {
    public static void main(String[] args) {
        int arr[][][] = new int[3][3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    System.out.println(arr);
                }
            }
        }
    }
}
