package u1_control_statements_kunal;

public class Loop {
    public static void main(String[] args) {

        // loop block scope
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(i);
        // }

        // int i = 0;

        // while (i < 3) {
        //     System.out.println(i);
        //     i++;
        // }

        int j = 0;
        do {
            System.out.println(j); // runs atleast one time
            // j++;
        } while (j < 0);  
        
        for (int j2 = 0; j2 < 3; j2++) {
            if (j2 == 2) {
                break;
            }
            System.out.println(j2);
        }   

        System.out.println("Even numbers");
        for (int j3 = 1; j3 <= 10; j3++) {

            if (j3 % 2 == 1) {
                continue;
            }
            System.out.println(j3);
        }


    }
}
