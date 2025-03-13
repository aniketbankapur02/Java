package classwork;

class Human {
int age;
String name;
static int populationCounter;// population count is common for all thats why it is static
// for every object creation population is increamented and it is common for all 

    Human(int age,String name){
        this.age = age;
        this.name = name;
        // for evry object creation increamant popluation
        // instead of writing here you can write in instance block
        // as it renders for every new object creation
        Human.populationCounter+=1;// no need of this bec static is not related to objects it common for all objects
        // it only relatd class that wy we write class name
    }

    static void any(){
        // static int any = 1;// you cannot define static in any static or non static methods you can define only in class 
    // name = "hi"; // you cannot use non static in static as it demands to make objects
    // as name beongs to isntance you cannot use it
    // as in static method calls there is no need to create objects you write non static method directly it demands to create objects creation so logically this is not possbile as we not creating objects for static mehtod
    // in static mehtods only static can be used as it does not depends on object
    }

    
}

public class U1Static {
    static int a;
    public static void main(String[] args) {
        // static int b; you cannot define static in any static or non static methods you can define only in class    
        Human h1 = new Human(22,"xyz1");
        System.out.println(Human.populationCounter);// it should be 1 as currently there are one person
        Human h2 = new Human(22,"xyz2");

        System.out.println(Human.populationCounter);// it should be 2 as currently there are two person

        // System.out.println();// it will work but this is not right convenstion to use as static is not related to objects
        // how it can if it is not related to object JVM see h1.populationCounter exist or not in heap if not it will check method area 
    }
}
