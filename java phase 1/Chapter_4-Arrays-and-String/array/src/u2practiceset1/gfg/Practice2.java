package u2practiceset1.gfg;
import java.util.Scanner;
/*
 Concept of Distinct Elements
Distinct elements are unique values in a collection. For example, in the array [1, 2, 2, 3], the distinct elements are [1, 2, 3], and the count is 3.

Duplicates are ignored when counting distinct elements.

Input: nums = [1, 2, 2, 3, 4, 4, 5]  
Output: 5  
Explanation: The distinct elements are [1, 2, 3, 4, 5].  

Input: nums = [10, 10, 10]  
Output: 1  
Explanation: The only distinct element is [10].  

Input: nums = [5, 7, 8, 9, 5]  
Output: 4  
Explanation: The distinct elements are [5, 7, 8, 9].  

Just get array ignoring duplicates value and count that array


another approach is to sort and reduce the count length if pre and current are same as they are not distinct
 */
public class Practice2 {

    static int countDistinctArray(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        int counter = arr.length;
        int check = 0;// used check so for that element twice check should be not done
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && check == 0) {
                    // continue;
                    counter--;
                    check = 1;
                }
            }
            check = 0;
        }
        // if (counter <= 0) {
        //     return 1;
        // }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

        System.out.println(countDistinctArray(arr));
        sc.close();

    }
}
