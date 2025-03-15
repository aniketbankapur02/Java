package classwork.polymorphism;

public class Use {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Reactangle r = new Reactangle();
        Triangle t = new Triangle();
        Shapes ss = new Triangle();// parent ref_var holding object of child
        
        ss.area();// still not giving errro how can parent access child properties

        
    }
}
