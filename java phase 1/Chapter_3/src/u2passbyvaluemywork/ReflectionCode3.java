package u2passbyvaluemywork;
// to change a we have to create wrapper class


class Wrapper  {
int a;   
}
public class ReflectionCode3 {
    public static void main(String[] args) {
        Wrapper ref_var = new Wrapper();
         ref_var.a = 1;

        System.out.println(ref_var.a);
        change(ref_var);
        System.out.println(ref_var.a);

    }

    static void change(Wrapper ref_var2){
        ref_var2.a = 2; // now same object is accessed via . operator and it is changed via a
    }
}
