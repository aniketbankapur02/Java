package classwork;
public class U3InnerClass {
    int a; // non static field need to create object to use

    public class Test1 {// non static class need to create object to use
        String name;

        Test1(String name) {
            this.name = name;// obejct name is replaced by local name
        }

        /*
         * now just like class fields and members
         * inner class is also like that
         * inner class is non static member of outter class
         * to use this class you need to create object for it
         */
    }

    static int b; // static field no need to create object to use

   static public class Test2 { // static class no need to create object to use
        String name;

        Test2(String name) {
            this.name = name;// obejct name is replaced by local name
        }

        /*
         * now just like static class fields and members
         * inner class is also like that
         * inner class is static member of outter class
         * to use this class you don't need to create object for it
         */
    }

    public static void main(String[] args) {
        // Test a = new Test("xyz1");
        // Test b = new Test("xyz2");

        /*
         * you can see above directly using member(inner class) of outter class without
         * creating object gives you error as class is not static you need to create
         * object
         * you need to create onject for that just like before we did to access fields
         * and methods
         */

        U3InnerClass obj1 = new U3InnerClass();
        obj1.a = 1;// b is non static field of outter class it depends on objects so we need to create objects
        
        // similarly for non static class 
        Test1 a = obj1.new Test1("xyz1");
        // inner class is non static class of outter class it does  depends on object it is not shared so we need to create object
        Test1 b = obj1.new Test1("xyz2");

        /*
         * // Correct way to instantiate inner class
         * U3InnerClass.Test a = obj1.new Test("xyz1");
         * U3InnerClass.Test b = obj1.new Test("xyz2");
         */

        /*
         * now we have used using object it wont give error
         */
        System.out.println(a.name);// xyz1
        System.out.println(b.name);// xyz2

        U3InnerClass.b = 2;// b is static field of outter class it does not depend on objects so no need to create objects for
        // similarly similar for non static class
        // inner class is static class of outter class it does not depends on object it is shared no need to create object
        Test2 c = new Test2("xyz1");
        Test2 d = new Test2("xyz2");


    }
}
