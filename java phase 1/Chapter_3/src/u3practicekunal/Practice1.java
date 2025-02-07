package u3practicekunal;
import java.util.Scanner;
// prime number 
public class Practice1 {
    
    static boolean prime(int n){

        boolean check = true;

        if (n == 1) {
            check = false;
            return check;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = false;
                return check;
            }
        }


        return check;
    }

    static boolean amg(int n){
        boolean check ;

        int original = n;
        int newNum = 0;
        while (n > 0) {
            newNum = newNum + (n % 10) * (n % 10) * (n % 10);
            n /= 10;    
        }
        // if (original == newNum) {
        //     check = true;
        // }else{
        //     check = false;
        // }

        /*
        if you dont write check variable
         if(original == newNum){
         return true;
         }
         return false
         */


        return original == newNum;// if right == return true if not == returns false
        

    }

    // print amg from given range
    
    static void amg2(int start, int end){
        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue;
            }
            int amg = 0;
            int original = i;
            while (original > 0) {
                amg = amg + (original % 10) * (original % 10) * (original % 10); 
                original /= 10;
            }
            if (i == amg) {
                System.out.println(amg);
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // System.out.println(prime(sc.nextInt()));

        // System.out.println(amg(sc.nextInt()));

        amg2(sc.nextInt(),sc.nextInt()) ;

        sc.close();
    }
}
