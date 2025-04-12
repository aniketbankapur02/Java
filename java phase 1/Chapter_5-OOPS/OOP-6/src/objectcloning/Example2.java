package objectcloning;

class Human implements Cloneable{// Remove implements Cloneable to get exception
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

    // we are using clone method of parent object
    @Override
    protected Object clone() throws CloneNotSupportedException { // if class does not implements Cloneable it clone will thorw an exception
        // why this declaration of  CloneNotSupportedException is needed
        /*
         Bec if Human class does not implement Cloneable class it will throw ClonenotSupportedException
         so it is imp to declare CloneNotSupportedException to function as it can throw this ClonenotSupportedException
         */

        return super.clone(); // to use parent properties use super
    }
    
}


public class Example2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(22, "Aniket");
        Human h2 = new Human(h1);//clone a object

        Human h3 = (Human)h1.clone();// i am usign clone which can throw CloneNotSupportedException so it is imp to mention CloneNotSupportedException as thorws during function declaration
        // thorws exception means in function declaration means some element can thorw exception
        // so it is imp to mention it thorws 

        // so no use of new like h2 to clone 

        /*
         but this is not effective and it creates lot of overhead
         we use clone method of parent object in next example
         class needs to implement clonable interface just to tell JVM

         
         */

         System.out.println(h3.age + " " + h3.name);
    }
}
