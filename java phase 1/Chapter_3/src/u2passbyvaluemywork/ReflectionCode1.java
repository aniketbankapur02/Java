package u2passbyvaluemywork;
// case 1 where reflection happens bec of object access 
class Numbers {
    int a ;
    int b ;    
}

public class ReflectionCode1 {

    // here only reference code are swapped
    static void swap(Numbers ref_var1,Numbers ref_var2){
        Numbers temp =  new Numbers();// temp storage in heap (note temp is in stack only with his hexa code but object value is in heap) you can even use stack  storage like int temp; here value will in stack memory 

        temp.a = ref_var1.a;
        ref_var1.a = ref_var2.b;
        ref_var2.b = temp.a;

    }
    public static void main(String[] args) {
        Numbers ref_var1 = new Numbers();
        Numbers ref_var2 = new Numbers();
        
        ref_var1.a = 1;
        ref_var2.b = 2;
        System.out.println( "Before swap  " + ref_var1.a + " " + ref_var2.b);
        swap(ref_var1, ref_var2);
        System.out.println("After swap " + ref_var1.a + " " + ref_var2.b);
    
    }

}
