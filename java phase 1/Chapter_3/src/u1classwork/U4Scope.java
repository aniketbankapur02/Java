package u1classwork;

public class U4Scope {
    public static void main(String[] args) {
        int a = 1;

        // method scoping
        // System.out.println(marks);  // error you can access outside method variable this method scoping

        // block scope
        {
            int b = 2;
            a = 2;
            // int a = 1; // error saying a is already defined as all above line of codes till here is visible to this block line of code
        }
        // all visibility of this block ends after braces
        // b is erased

        // System.out.println(b);// error saying b is undefined
        // you cannot use b as it is erased you can defined b again


        for (int i = 0; i < args.length; i++) {
            System.out.println(i);
            a = 1; // fine

            // int a = 1; // error saying a is already defined as all above line of codes till here is visible to this block line of code
            int num = 1;
        }
        // System.out.println(num);// error as num is erased after loop scope block
        // System.out.println(i);// error as i erased after loop scope block
    
    }
    static void change(int marks){
        // a = 1; // error you can access outside method variable this method scoping
    }
}
