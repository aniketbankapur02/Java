package interfaces.extenddemo;
/*
 interface to interface inheritence is done via extends
 class to interface inheritence is done via implements
 class to class inheritence is done via extends

 */
interface A {
    void fun();
}
interface B extends A{// now B has all content of A
    void greet();
}

public class Example1 implements B{// this class extend B that has two methods so Example1 has two implement both methods fun and greet via override
    @Override
    public void fun() {
        System.out.println("fun");
    }
    @Override
    public void greet() {
        System.out.println("hello");
    }
}
