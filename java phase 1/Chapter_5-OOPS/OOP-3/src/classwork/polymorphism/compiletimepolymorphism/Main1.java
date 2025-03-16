package classwork.polymorphism.compiletimepolymorphism;
// notes at bottom
/*
 overloading can be done if return type is diff,order is diff with same name 
 */
class Calculator{
    double add(double a,int b){ // method 1
        return 1;
    }
    double add(int a,double b){//method 2 // overload can be done if order is diff
        return 2;
    }
    int add(int a,int b){// method 3
        return 3;
    }
}


public class Main1 {
    
    public static void main(String[] args) {
        Calculator ref = new Calculator();
        // same ref (entity) is taking different forms
        ref.add(1,2);// calls method 3
        ref.add(1,2d);// calls method 2 (lets suppose method 2,3 is not present then implicit typecast will be made int to double to call method 1 )
        ref.add(1d,2);// calls method 1 

        System.out.println(ref.add(1,2));
        System.out.println(ref.add(1,2d));
        System.out.println(ref.add(1d,2));

        
    }

}



/*
 Polymorphism in Java allows objects to take on multiple forms, enabling a single interface to represent different underlying behaviors. There are two types of polymorphism:

Compile-time (Static) Polymorphism: Resolved during compilation (e.g., method overloading).

Runtime (Dynamic) Polymorphism: Resolved during runtime (e.g., method overriding).

Here, we’ll focus on compile-time polymorphism (method overloading) with code examples.

What is Compile-Time Polymorphism?
It occurs when multiple methods in the same class have the same name but different parameters (different type, number, or order). The compiler decides which method to call based on the method signature at compile time.

Code Example: Method Overloading
java
Copy
class Calculator {
    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two doubles (different parameter types)
    double add(double a, double b) {
        return a + b;
    }

    // Method 4: Add a String and an integer (different parameter order)
    String add(String str, int num) {
        return str + num;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls Method 1 (int, int)
        System.out.println(calc.add(2, 3)); // Output: 5

        // Calls Method 2 (int, int, int)
        System.out.println(calc.add(2, 3, 4)); // Output: 9

        // Calls Method 3 (double, double)
        System.out.println(calc.add(2.5, 3.5)); // Output: 6.0

        // Calls Method 4 (String, int)
        System.out.println(calc.add("Result: ", 10)); // Output: Result: 10
    }
}
Key Points
Method Signature: The compiler uses the method name, parameter types, and parameter order to decide which overloaded method to call.

Return Type Doesn’t Matter: Overloaded methods can’t differ only by return type (e.g., int add() vs. double add() is invalid).

Type Promotion: If no exact match is found, the compiler promotes types (e.g., int → double).

Another Example: Constructor Overloading
java
Copy
class Person {
    String name;
    int age;

    // Constructor 1: Default
    Person() {
        this.name = "Unknown";
    }

    // Constructor 2: Takes name only
    Person(String name) {
        this.name = name;
    }

    // Constructor 3: Takes name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(); // Calls Constructor 1
        Person p2 = new Person("Alice"); // Calls Constructor 2
        Person p3 = new Person("Bob", 25); // Calls Constructor 3
    }
}
Why Use Compile-Time Polymorphism?
Readability: Use the same method name for logically similar operations.

Flexibility: Handle different data types or numbers of inputs.

Code Reusability: Avoid redundant method names like addTwoInts(), addThreeInts(), etc.

Summary
Compile-time polymorphism = Method overloading.

The compiler binds the method call to the correct method at compile time based on the method signature.

Overloading works for both methods and constructors.
 */