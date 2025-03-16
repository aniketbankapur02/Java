package classwork.polymorphism.compiletimepolymorphism;
// example 2

class Person  {
    int age;
    String name;

    Person(){
        this.age = 18;
        this.name = "xyz1";
    }

    Person(String name){
        this.age = 18;
        this.name = name;
    }

    Person(int age,String name){
        this.age = age;
        this.name = name;
    }
}
public class Main2 {
    public static void main(String[] args) {
        // entity has taken diff forms
        /*
         so which consructor need to run is determine at compile time
         so compile time polyphorism is implemented via method overloading
         */
        Person p1 = new Person();
        Person p2 = new Person("xyz2");
        Person p3 = new Person(22,"xyz3");
    }
}
