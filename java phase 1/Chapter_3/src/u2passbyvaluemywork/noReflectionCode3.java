package u2passbyvaluemywork;
// wrapper class 
// this also same case like string 
// new object is created in heap object is not modified as we are not accessin object via . or []
public class noReflectionCode3 {
    public static void main(String[] args) {
        Integer a = 1;

        System.out.println(a);
        change(a);
        System.out.println(a);

    }

    static void change(Integer a){
        a = 2; // new object is created in heap it is not modified via . or [] so this is not reflected
    }
}
