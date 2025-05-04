package assign1.code12;

/*
Swap Two Variables Without Using Third Variable or Arithmetic Operators
 */
public class Main {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("Before: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After: a = " + a + ", b = " + b);
    }
}
