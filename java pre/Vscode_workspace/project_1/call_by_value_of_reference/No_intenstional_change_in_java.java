package call_by_value_of_reference;

class wrapper1{
    int a;
    wrapper2 obj;
}
class wrapper2{
    int b;
}

public class No_intenstional_change_in_java {
    public static void main(String[] args) {
        // make any object like array or class obj like wrapper

        int arr1[] = new int[]{1};//m  // let suppose hexacode is 100
        int arr2[] = arr1;//k = &m; // game same hexacode to arr2 that is 100
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        arr2 = new int[]{5};// k tries to change m but here it will not happen arr2 is reinitlizd to new object in heap he will have new hexa code
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        wrapper1 ref_var = new wrapper1();
        ref_var.obj.b = 1;

    }
}
