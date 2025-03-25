package interfaces.defaultdemo;
//when we write static method in interfaces we have to define whole body as class who implements interface caanot override static method as we know that static method cannot be ovrriden
// so define whole body for static methods in interface dont just declare it  
interface A {
    static void greet(){
        System.out.println("hello");
    }
}

public class Example2 implements A{
    // As Example2 has implemented A Example2  has method greet method
    /*
    you can imagine greet over here like below
        static void greet(){
        System.out.println("hello");
    }
    */
    public static void main(String[] args) {
        A.greet();
        // Example2.greet(); not possible to call with child class only interface call is possible
    } 
    
}
