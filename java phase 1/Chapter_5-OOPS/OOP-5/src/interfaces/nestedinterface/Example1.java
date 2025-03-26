package interfaces.nestedinterface;

class A {

    interface InnerExample1 {
        Boolean checkOdd(int n);
    }
}

 class B implements A.InnerExample1 {
    @Override
    public Boolean checkOdd(int n) {
        return n % 2 == 1;
    }
}

public class Example1{
    public static void main(String[] args) {
        B r = new B();
        System.out.println(r.checkOdd(6));
    }
}


