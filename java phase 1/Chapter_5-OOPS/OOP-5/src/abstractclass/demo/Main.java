package abstractclass.demo;

abstract class Parent {
    int age;

    public Parent(int age){
        this.age = age;
    }

    abstract void career();
    abstract void education();
}

class Son extends Parent {

    public Son(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("i want to becone dr" + " Age is :" + this.age);    
    }

    @Override
    void education() {
        System.out.println("i want to do education in MBBS" + " Age is :" + this.age);    
    }

}

class Doughter extends Parent {
   
    public Doughter(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("i want to becone Engineer" + " Age is :" + this.age);    
    }

    @Override
    void education() {
        System.out.println("i want to do education in BE/BTech" + " Age is :" + this.age);    
    }

}

public class Main {    // keep main signature in main method 
    public static void main(String[] args) {
        Son son = new Son(16);
        Doughter doughter = new Doughter(10);
         
        son.career();
        doughter.career();
   }
}