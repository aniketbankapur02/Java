package abstractclass.demo;


interface hello {
// final int a = 1;
    
}
// cannot apply finalto abstract as child need to override parent abstract class if final you cannot even inherit
abstract class Parent {
    int age;

    // notmal final are allowed

    final int FINAL1 = 1;
    final int FINAL2;// for this final you need to inilize via constructor as it is non static method
    
    // normal static is allowed
    static int test = 1; 

    public Parent(int age){
        this.age = age;
        this.FINAL2 = 2;// this bec it is not static
        /*
         for child class inilize you have to do via super
         */
    }

    // abstract Parent(); abstract constructor is not allowed 
    /*
    as we dont want to define abstract methods for every cosntructor calls
    */
    // only normal constructor making is allowed like above 

    // abstract static method is not possible as it cannot be overriden only non abstract static method is allowed

    //error
    // abstract static void career2(){

    // }

    // no error
    static void career2(){

    }

    

    abstract void career();
    abstract void education();

    // like above abstract method normal mehtod is alloweds
    void career3(){

    }
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

        Parent d = new Doughter(10);
        d.career();
        /*
         right click and check as parent dont know properties of child at compile time it navigates to parent abstract class 
         but during runtime it executes child properties bec of overriding
         */

         // lets make complete object of parent class
         // directly it wont possible you have to define method for that abstract class

        //  Parent par = new Parent();// error as it will give you as abstract method of parent class is undefined

        Parent par = new Parent(2) {
            @Override// writing override does not mean it will overide this method override is just overide checker whether below mehtod will override or not
            void career() {
                System.out.println("Parent career");
            }
            @Override
            void education(){
                System.out.println("Parent education");
            }
        };
        // for par object.method thi above method will be executed

        /*
        right click and check as parent dont know properties of child at compile time it navigates to parent abstract class 
        but during runtime it executes child properties bec of overriding
         */
        par.career();
        par.education();
        

   }
}