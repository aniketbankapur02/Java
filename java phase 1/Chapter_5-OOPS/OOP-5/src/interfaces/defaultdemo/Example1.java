package interfaces.defaultdemo;

 interface A {
    default void fun(){
        System.out.println("fun method of A");
    }
    void greet();

}
interface B{
    // void fun();
    default void fun(){
        System.out.println("fun method of B");
    }
   void greet();
}

public class Example1 implements A,B{
    //here Example1 implements A and B and both interface has common method fun and greet
    // both are default so there will be confusion for class which body need to be taken
    // in real we cannot define two body for one method name in one class
    // there should be only one body defination for both interfaces methods

    // due to default there is two body defination we can define only one in a class
    // so we need to override so that there is only one method body for fun not two default methods
    // if we override there will be one body for both common method of interface    

    /*
     soln keep override to have one body for both fun or remove fun of B or A
     */
    // @Override
    // public void fun() {
    //     System.out.println("fun");
    // }
    @Override
    public void greet() {
        System.out.println("hello");
    }
}
