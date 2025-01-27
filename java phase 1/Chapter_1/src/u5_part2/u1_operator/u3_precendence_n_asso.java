package u5_part2.u1_operator;

public class u3_precendence_n_asso {
    public static void main(String[] args) {
        int a = 4;
        a = a + a++ + ++a * --a + a--;
        System.out.println(a);

        int x = 2;

        float z = ((float)++x/(x++ - 1));
        System.out.println(z);


        int a1 = 2;
        int b = 2;

   
        float c1 = (float)++a1/(b++ - a1++);
        // no precendence is followed
        // 3 / 2 - 3
        // -3

        // precendence is followed like post fix is evaulated first but java never does it
        // 
        //    4/(2 - 2)

        System.out.println(c1);


        int a10 = 2;
        a10 = a10 + a10 * a10 / a10 / a10 * a10;

        System.out.println(a10);
    }
}
