package assign1.code13;
import java.util.Scanner;
/*
Check if Two Numbers Are Equal Using Only Logical Operators
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (!((n1 ^ n2) != 0)) {
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }
        sc.close();
    }
}
