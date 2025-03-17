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

/*
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

what will be the output and why
The output of the code will be:

Copy
hello from child
Explanation
Static Methods and Inheritance:

Static methods belong to the class, not the instance.

They are resolved at compile time based on the reference type, not the actual object type.

Method Hiding (Not Overriding):

When a subclass defines a static method with the same signature as a static method in its superclass, it hides the superclass method.

This is not method overriding because static methods are not subject to runtime polymorphism.

Code Analysis:

B ref = new B(); creates an object of class B.

B.hello(); calls the hello() method defined in class B because the reference type is B.

Key Points
Static methods are not overridden; they are hidden when redefined in a subclass.

The method to be called is determined by the reference type (B in this case), not the object type.

If you had written A.hello();, the output would have been hello from parent because the reference type would be A.

Example with Reference Type A
java
Copy
public class OverrideStatic {
    public static void main(String[] args) {
        A ref = new B(); // Reference type = A, Object type = B
        ref.hello(); // Calls A.hello() because static methods are resolved by reference type
    }
}
Output:

Copy
hello from parent
Why Static Methods Can’t Be Overridden
Static methods are bound at compile time, while overriding relies on runtime binding.

Overriding depends on the actual object type, but static methods depend on the reference type.

Best Practices
Avoid redefining static methods in subclasses to prevent confusion.

Use instance methods if you need runtime polymorphism.

Call static methods using the class name (e.g., A.hello(), B.hello()) for clarity.
 */


 /*
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

As it does not overrides priority should be of parent right?

Great question! Let’s clarify why the child class method is called here, even though static methods cannot be overridden.

Output Explanation
The code will print:

Copy
hello from child
Why?

Static methods are resolved at compile time based on the reference type (class name), not the object type.

You’re explicitly calling B.hello(), so the compiler uses the static method from class B.

Key Concepts
Static Methods Are Class-Level:

They belong to the class, not instances.

When you call B.hello(), you’re invoking the method tied to class B, not the object.

Method Hiding (Not Overriding):

The hello() method in B hides the hello() method in A (they are two separate methods).

No overriding occurs, so there’s no "priority" for the parent method.

Example Scenarios
1. Calling via Child Class Reference:
java
Copy
B.hello(); // Output: "hello from child"
The compiler sees B as the reference type and calls B’s static method.

2. Calling via Parent Class Reference:
java
Copy
A.hello(); // Output: "hello from parent"
The compiler sees A as the reference type and calls A’s static method.

3. Using a Parent Reference Pointing to Child Object:
java
Copy
A ref = new B();
ref.hello(); // Output: "hello from parent"
Even though the object is of type B, the reference type is A, so A’s static method is called.
Static methods ignore the object type!

Why Doesn’t the Parent Method Have "Priority"?
Static methods are not part of polymorphism.

The compiler treats A.hello() and B.hello() as two separate methods (no parent-child relationship).

The method called depends entirely on how you reference the class (e.g., A.hello() vs. B.hello()).

Key Takeaways
Static methods are bound at compile time (no runtime decision-making).

To avoid confusion, always call static methods using the class name (not instances):

java
Copy
B.hello(); // Good
new B().hello(); // Avoid (misleading)
Use instance methods if you need overriding/runtime polymorphism.


  */

  /*
   public class OverrideExample {
    int num;

    OverrideExample(int num) {
        this.num = num;
    }

    // if i comment this method it will call parents object and hexacode is printed
    @Override // not giving compile time error as it overrides parent class object
    public String toString() {// when you right click it it points to parent object to string as it is compile time and overrides happens during runtime so our method is executed in runtime so pointing to our toString happens at run time
        return "" + this.num;
    }
    public static void main(String[] args) {
        OverrideExample ref = new OverrideExample(10);
        System.out.println(ref);// we will get hexacode to avoid this we can override it
    }

}
in this example due to override it is calling child toString if it does not overrides then it will call parent toString ie of object class right or wont answer me this you to me ? then in static there is no overiding right ??????? then why it is calling child method it should call parent only like this toString example due to no overide there is no child call right or wrong answer this to me then
Let’s break this down step by step to clarify the confusion:

1. Instance Methods (e.g., toString()): Overriding Works
In your OverrideExample class:

toString() is an instance method inherited from the Object class.

When you override it in the child class (OverrideExample), the JVM uses runtime polymorphism to call the overridden method based on the object’s actual type.

Output when toString() is overridden:

java
Copy
System.out.println(ref); // Output: 10 (child’s toString())
Output if you comment out toString():

java
Copy
System.out.println(ref); // Output: classwork.polymorphism.OverrideExample@1a2b3c (Object’s toString())
Why?

Instance methods are resolved at runtime using the actual object type (dynamic binding).

2. Static Methods: No Overriding, Only Hiding
In your earlier A and B example:

Static methods are resolved at compile time based on the reference type (static binding).

When you call B.hello(), the compiler directly links it to B’s static method.

This is method hiding, not overriding.

Example:

java
Copy
A ref = new B();
ref.hello(); // Calls A.hello() (parent’s method) because reference type is A.
Why?

Static methods belong to the class, not the object.

The compiler ignores the object’s actual type and uses the reference type.

Key Differences
Feature	Instance Methods (e.g., toString())	Static Methods (e.g., hello())
Binding	Runtime (dynamic binding)	Compile-time (static binding)
Depends on	Actual object type	Reference type
Override Support	Yes (true polymorphism)	No (method hiding only)
Example	System.out.println(ref)	A.hello() vs. B.hello()
Answering Your Questions
Q1: If toString() is not overridden, will it call the parent’s method?
Yes. The parent (Object)’s toString() will execute, printing the hash code.

Q2: Why does the child’s toString() get called when overridden, but static methods don’t work the same way?
Instance methods use runtime polymorphism: the JVM checks the object’s actual type.

Static methods use compile-time binding: the compiler uses the reference type, not the object type.

Q3: Why does B.hello() call the child’s method even though static methods can’t be overridden?
You’re explicitly using the child class name (B.hello()), so the compiler links it to B’s static method.

If you used A.hello(), it would call the parent’s method.

Summary
Instance Methods: True overriding (runtime decision).

Static Methods: No overriding; method hiding (compile-time decision).

toString() Example: Overriding works because it’s an instance method.

Static Method Example: B.hello() is called because you used B’s reference, not because of overriding.
   */


   /*
    Q2: Why does the child’s toString() get called when overridden, but static methods don’t work the same way?
Instance methods use runtime polymorphism: the JVM checks the object’s actual type.
Static methods use compile-time binding: the compiler uses the reference type, not the object type

you are getting confuse bro
i am not saying static works same

i am saying if method does not override it calls parent class method right or wrong?? as we can see in toString example so static method does not override right so it should also call parent class method like toString r u getting my point dear
---
You’re absolutely right to point this out! Let me clarify the confusion with a direct comparison between your two examples (instance method toString() vs. static method hello()). The key difference lies in how Java treats instance methods vs. static methods when they are not overridden. Let’s break it down:

Scenario 1: Instance Method (toString())
Case 1: toString() is NOT overridden
java
Copy
public class OverrideExample {
    int num;
    // No toString() method here
}

public static void main(String[] args) {
    OverrideExample ref = new OverrideExample(10);
    System.out.println(ref); // Calls Object’s toString() (parent method)
}
Output: classwork.polymorphism.OverrideExample@1a2b3c
Why?

Since toString() is not overridden, Java uses the parent class (Object) method. This is runtime polymorphism’s "fallback" behavior.

Case 2: toString() is overridden
java
Copy
@Override
public String toString() {
    return "" + this.num;
}
Output: 10
Why?

The overridden toString() is called at runtime because instance methods use runtime binding.

Scenario 2: Static Method (hello())
Case 1: hello() is NOT overridden
java
Copy
class A {
    static void hello() { System.out.println("Parent"); }
}

class B extends A {
    // No static hello() here
}

public static void main(String[] args) {
    B.hello(); // Calls A’s hello() (parent method)
}
Output: Parent
Why?

If the child class does not define the static method, Java inherits the parent’s static method. This works like your toString() example.

Case 2: hello() is "overridden" (method hiding)
java
Copy
class B extends A {
    static void hello() { System.out.println("Child"); }
}

public static void main(String[] args) {
    B.hello(); // Calls B’s hello()
}
Output: Child
Why?

Static methods are hidden, not overridden. When you define hello() in B, you’re creating a new method tied to class B.

The compiler uses the reference type (B in B.hello()) to decide which method to call.

Your Core Confusion
You’re asking:

"If a static method is not overridden, it should call the parent method, just like toString(). But when I define hello() in B, why does it call the child’s method?"

The answer:

If you don’t define hello() in B, B.hello() will call A.hello() (parent method).

If you define hello() in B, you’re hiding A.hello(), not overriding it. Now B has its own static method.

When you call B.hello(), you’re explicitly asking for B’s method.

Key Takeaway
Instance Methods: If not overridden, parent method is called (runtime binding).

Static Methods:

If not defined in child, parent method is called (inheritance).

If defined in child, child method is called (method hiding), and it depends on reference type (B.hello() vs. A.hello()).

Example Proving Static Method Inheritance
java
Copy
class A {
    static void hello() { System.out.println("Parent"); }
}

class B extends A {
    // No static hello() defined here
}

public static void main(String[] args) {
    B.hello(); // Output: Parent (inherited from A)
}
This behaves exactly like your toString() example when the method is not overridden.

Summary
Static methods don’t override → They hide the parent method.

If you don’t hide (i.e., don’t define the method in the child), the parent method is called.

If you hide (define the method in the child), the child method is called when using the child’s reference.

This aligns with your toString() example’s logic. The confusion arises because static methods require explicit class-based calls (B.hello()), while instance methods use object references.     



*/