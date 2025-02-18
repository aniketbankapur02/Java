package u1classworkunal;

import java.util.ArrayList;
import java.util.Scanner;



/*
 ArrayList of ArrayList
 */
public class U5_DynamicArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ref_var = new ArrayList<>();

Scanner sc = new Scanner(System.in);

for (int i = 0; i < 3; i++) {
    ref_var.add(new ArrayList<>());// we have to allocate arrayList in each row
    // if not allocation we will get error
}
// now box is filled with ArrayList
        // input

        for (int i = 0; i < 3; i++) { // we have to take row size ie how many ArrayList from user
            for (int j = 0; j < 3; j++) {// we are making 3 col for each arraylist 
                ref_var.get(i).add(sc.nextInt());
                // we have allocated arrayList in each row and now we have to add integer element for that particular index of arraylist thats why we used get method to get array list
              
            }
        }

        for (int i = 0; i < 3; i++) {
            // for (int j = 0; j < 3; j++) {
               System.out.println(ref_var.get(i));// printing one by one arraylist
            // }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.print(ref_var.get(i).get(j) + " ");// printing one by one element of that arraylist particularly
            
            /*
             via i i am getting arraylist
             via j i am getting particular element of that arraylist 
             */
            }
            System.out.println();
        }

        System.out.println(ref_var);// internally it is converted to string
    }
}
