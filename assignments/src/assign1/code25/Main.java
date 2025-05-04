package assign1.code25;

/*
Find the GCD (Greatest Common Divisor) of two numbers without using recursion.

 */
public class Main {
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    static int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

    public static void main(String[] args) {
        System.out.println(max(5, 10));
        System.out.println(max(5, 10, 7));
        System.out.println(max(5, 10, 7, 12));
    }
}