package u1classwork;

public class U1Classwork{
    
    // static method declaraction
    public static void name() {
        System.out.println("hello");
    }
    // non static method declaraction
    public  void name2() {
        System.out.println("hello");
    }

    // function of int type(primitives)
    // return value is of int 
    static int sum(int a , int b){
        return a + b;// expression should of int only else it will throw error
         
    }

    // function of String type(non primptive / reference type)
    // return value is of String

    static String returningAppendedString(String str1,String str2){ // apending two string
        return str1 + str2;

        // return 23; error bec type mismatch
    }
    static String returningAppendedString2(String str1,String str2){ // apending two string
       String s = str1 + str2;
        return s;

        // return 23; error bec type mismatch
    }


    static void greeting(){

        System.out.println("Hello there");

        return;// here function is pop out from stack so anything below will not executed

        // System.out.println("check"); error unreachable code


    }


    public static void main(String[] args) {
        // function call for static method (no need to create objects)
        name(); // void is returned after executing lines of method 

        U1Classwork ref_var = new U1Classwork();
        // function call for static method (no need to create objects)
        ref_var.name2();

        sum(0, 0);// int value is retunred after code execution   
        // sum has value of integer type 

        // we can print directly or store it 

        System.out.println(sum(0, 0));
        int s = sum(0, 0);

        System.out.println(s);

        //returning value string and printing it directly you can even store it 
        System.out.println(returningAppendedString("Hello", "there"));

        String s1 = returningAppendedString2("hi","there");

        System.out.println(s1);

    }
}