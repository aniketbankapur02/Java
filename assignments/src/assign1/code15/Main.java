package assign1.code15;



/*
Implement exponentiation (power function) manually without using Math.pow(), using
only loops and * operator.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int max = 0;
        if (a > b) {
            max = a;
        }else{
            max = b;
        }
        System.out.println(max);
    }
}
