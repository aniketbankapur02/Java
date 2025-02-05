package u2passbyvaluemywork;
// case where  swaping reference code so no reflection happens as we not accessed object value (all notes in note book)
// case 3

 class Numbers {
    int a ;
    int b ;    
}

public class noReflectionCode2 {

    // here only reference code are swapped
    static void swap(Numbers ref_var1,Numbers ref_var2){
        Numbers temp =  new Numbers();// temp storage in heap (note temp is in stack only with his hexa code but object value is in heap) you can even use stack  storage like int temp; here value will in stack memory 

        temp = ref_var1;
        ref_var1 = ref_var2;
        ref_var2 = temp;

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
