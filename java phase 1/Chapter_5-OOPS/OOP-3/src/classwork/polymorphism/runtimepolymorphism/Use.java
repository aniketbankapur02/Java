package classwork.polymorphism.runtimepolymorphism;

public class Use {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Reactangle r = new Reactangle();
        Triangle t = new Triangle();
        Shapes ss = new Triangle();// parent ref_var holding object of child
        
        ss.area();// still not giving errro how can parent access child properties
        /*
         when i right click it navigates to shpaes method
         but when i print it gives triangle not shapes as it is calling method of triangle class(child)
         */

         double a = 20;

        //  int b = 1.5f; implicit is not for high to low due to data loss

        
    }
}


/*
 Runtime Polymorphism (Method Overriding) in Java allows a subclass to provide a specific implementation of a method that is already defined in its superclass. The method to be executed is determined at runtime based on the actual object type, not the reference type. This is also called dynamic method dispatch.

Key Concepts
Inheritance Required: Method overriding works in a parent-child class relationship.

Same Signature: The subclass method must have the same name, parameters, and return type as the superclass method.

Dynamic Binding: The JVM decides which method to call at runtime based on the object’s actual type.

Code Example: Basic Method Overriding
java
Copy
class Animal {
    // Superclass method
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Override the superclass method
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {
    // Override the superclass method
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal; // Reference type = Animal

        myAnimal = new Dog(); // Actual object = Dog
        myAnimal.makeSound(); // Output: Dog barks: Woof!

        myAnimal = new Cat(); // Actual object = Cat
        myAnimal.makeSound(); // Output: Cat meows: Meow!
    }
}
How It Works
Upcasting: The reference myAnimal (of type Animal) points to a Dog or Cat object.

Dynamic Binding: At runtime, the JVM checks the actual object type (Dog or Cat) and calls the corresponding overridden method.

Flexibility: The same method call (makeSound()) behaves differently for different objects.

Rules for Method Overriding
Same Signature: Method name, parameters, and return type must match.

Access Modifier: The subclass method can’t be more restrictive (e.g., can’t override a public method with private).

@Override Annotation: Not required but recommended for clarity and compile-time checks.

No Static Methods: Static methods are bound at compile time (not runtime).

Example: Dynamic Method Dispatch
java
Copy
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();    // Upcasting
        shapes[1] = new Rectangle(); // Upcasting
        shapes[2] = new Shape();

        // Runtime polymorphism in action
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
Output:

Copy
Drawing a circle
Drawing a rectangle
Drawing a shape
When to Use Runtime Polymorphism
To redefine behavior in subclasses (e.g., different draw() logic for Circle and Rectangle).

To implement interfaces (e.g., List interface with ArrayList and LinkedList implementations).

For framework design (e.g., Spring dependency injection, where components are resolved at runtime).

Common Mistakes
Signature Mismatch:

java
Copy
class Parent {
    void show(int x) { ... }
}

class Child extends Parent {
    void show(double x) { ... } // NOT overriding (parameter type differs)
}
Overriding Static Methods:
Static methods are bound at compile time.

java
Copy
class Parent {
    static void print() { ... }
}

class Child extends Parent {
    static void print() { ... } // Method hiding (not overriding)
}
Final Methods:
You can’t override a final method:

java
Copy
class Parent {
    final void display() { ... }
}

class Child extends Parent {
    void display() { ... } // Compile error!
}
Benefits of Runtime Polymorphism
Flexibility: Code works with objects of multiple types.

Code Reusability: Common interface for shared methods (e.g., Animal → Dog, Cat).

Dynamic Behavior: Enables frameworks like Spring or Hibernate to resolve dependencies at runtime.

Summary
Runtime polymorphism = Method overriding + dynamic method dispatch.

The JVM binds the method call to the correct implementation at runtime based on the actual object type.

Use @Override to avoid mistakes and improve readability.
 */
