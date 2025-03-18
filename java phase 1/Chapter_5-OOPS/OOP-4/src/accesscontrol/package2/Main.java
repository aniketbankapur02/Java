package accesscontrol.package2;
import accesscontrol.package1.Animal;
// so sound is protected so i can use in subclass not in class
// and parent it self cannot use his protected in subclass
class Dog extends Animal {
    void bark(){
        Dog ref = new Dog();
        ref.sound();
        
        Animal obj = new Animal();
        // obj.sound();// error even object of animal its self cannot use his protected fields in subclass diff pkg as parent dont know properties child 

    }
}
public class Main {
    void bark(){
        Dog ref = new Dog();
        // ref.sound();// error so we cannot use protected in class we can use in sub class only
    }
}
