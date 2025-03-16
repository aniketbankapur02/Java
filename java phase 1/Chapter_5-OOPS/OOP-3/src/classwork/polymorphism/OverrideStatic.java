package classwork.polymorphism;
/*
 you cannot override static methods
 here method A is hided not overided
 in overide example we get to string of child
 here also we getting method of child only
 but here method is not overided but it is hided
 */

class A {
    static void hello(){
        System.out.println("hello from parent");
    }
}

class B extends A {
    static void hello(){
        System.out.println("hello from child");
    }
}

public class OverrideStatic {
    public static void main(String[] args) {
        B ref = new B();
        B.hello();
    }
}
