package objectcloning;

class Human  {
    int age;
    String name;

    Human(int age,String name){
        this.age = age;
        this.name = name;
    }

    Human(Human obj){
        this.age = obj.age;
        this.name = obj.name; 
    }
    
}


public class Example1 {
    public static void main(String[] args) {
        Human h1 = new Human(22, "Aniket");
        Human h2 = new Human(h1);//clone a object

        /*
         but this is not effective and it creates lot of overhead
         we use clone method of parent object in next example
         class needs to implement clonable interface just to tell JVM

         
         */
    }
}
