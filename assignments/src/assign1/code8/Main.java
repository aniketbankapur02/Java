package assign1.code8;

// LCM
public class Main {
    public static void main(String[] args) {
        int a = 15, b = 20;
        int max = Math.max(a, b);

        while(true) {
            if(max % a == 0 && max % b == 0) {
                System.out.println("LCM: " + max);
                break;
            }
            max++;
        }
    }
}
