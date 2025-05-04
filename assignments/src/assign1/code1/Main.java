package assign1.code1;
//Print All Prime Numbers Between 1 and 100
public class Main {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
    }
}
