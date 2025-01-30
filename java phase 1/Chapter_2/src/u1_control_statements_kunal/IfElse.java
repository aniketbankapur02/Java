package u1_control_statements_kunal;


class IfElse {
    public static void main(String[] args) {
        if (true) {
            System.out.println("hello");
        }

        if (false) {
            System.out.println("If");
        } else {
            System.out.println("Else block is executed");
        }


        if (false) {
            System.out.println("if");
        }else if (false) {
            System.out.println("else if #1");
        }
        else if (true) {
            System.out.println("else if #2");    
        }
        else {
            System.out.println("else will be executed at end if none above is executed");
        }

    }
}