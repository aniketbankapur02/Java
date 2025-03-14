package classwork.inheritence;
/*
 super keyword usecase
 to call constructor from parent 
 to call method from parent
 helps to differntiate 
 execution order for constructor is fix ie it should be in top of child as it does not know child properties 
 parent should be initilized first
 */


public class B1 extends A1 {
    int weight = 2; // even parent has weight how to differiate this usign super keyword
    
    B1(int weight){
        super();// to call parent constructor
        super.weight = 1;// always super should be first in execution order as super refer to parent and parent does not want to be involve in properties of child he dont know that
        this.weight = weight;
    }
    
   public void greet(){
        System.out.println("hello from child");
    }
    void message(){
        // super is referenceing to parent
        super.greet(); // see super is template can be used in template only
        this.greet();
    }
    
    
    
    public static void main(String[] args) {
        A1 ref = new A1();
        ref.greet();// bec of package private you can make object and can access it 
        // super.greet(); error as super thing is a template use in template only
        // super.greet(); cannot use super in static as you need to create object for it here we are refering it parenst so it super does not make objects
        // you are refering properties of parent method you have to create object to use it in static method
        /*
         A1 is template in which we can reuse his properties we are not ment to create objects like thing directly
         */
        B1 ref_var = new B1(0);
        ref_var.greet();// you can use greet by creating objects bec greet is method of B1 it is not written here but it is extend from parent 
        // have this mindset that all properties of A1 is written in B1
        System.out.println();
    }
}

/*
can we call parent method using super
 Yes, the super keyword in Java can be used to call a method of the superclass from within a subclass. This is particularly useful when a method in the subclass overrides a method in the superclass and you want to invoke the original method implementation from the superclass.
The syntax for calling a superclass method is super.methodName(), where methodName is the name of the method to be called.
Java

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound(); // Calls the makeSound() method of the Animal class
        System.out.println("Woof!");
    }
    
    public void doSomethingElse() {
        super.makeSound(); // Also calls the makeSound() method of the Animal class
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Generic animal sound, Woof!
        myDog.doSomethingElse(); // Output: Generic animal sound
    }
}
In this example, the Dog class overrides the makeSound method of the Animal class. Inside the overridden makeSound method, super.makeSound() is used to call the makeSound method of the Animal class before printing "Woof!". The super keyword can also be used in other methods of the Dog class, like in doSomethingElse(), to call methods of the Animal class.
 */
