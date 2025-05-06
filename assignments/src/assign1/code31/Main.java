package assign1.code31;
/*
 Write a method to calculate compound interest recursively
 */
public class Main {
    public static double computeCI(double principal, double rate, int time) {
        if (time == 0){
            return principal;
        }
        return computeCI(principal * (1 + rate / 100), rate, time - 1);
    }

    public static void main(String[] args) {
        double amount = computeCI(1000, 5, 3);
        System.out.printf("Compound Interest Amount: %.2f\n", amount);
    }
}