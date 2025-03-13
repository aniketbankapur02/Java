package classwork;
// to load class create object or use static fields somewhere


/*
 only instance block is executed when create object
 for every object creation instance block is executed
 if you have made constructor afte instance block constructor is executed

 run order
 first static block then instance block then constructor 
 */

class A {
    static int counter1;// default value is 0
// will only run once, when the first obj is create i.e. when the class is loaded for the first time (notes from kunal kushwaha)
    static {
        counter1++;
    }

}

public class U2StaticBlock {
    static int counter2;

    // counter is increamented only when class is loaded
    // class is loaded when we use some field or method of that class
    static {
        counter2++;
    }
    public static void main(String[] args) {
        System.out.println(A.counter1);// this increamneted bec due to main method call this class is executed once (actually we give main method class to jvm at that time this class is loaded by class loader in method area)
        U2StaticBlock obj1 = new U2StaticBlock();
        U2StaticBlock obj2 = new U2StaticBlock();
        System.out.println(A.counter1);//still 1
        System.out.println(counter2);// class A is loaded as we are acessing counter from it

        System.out.println(counter2);// still 1

        // to load use some members of it 

    }
}
