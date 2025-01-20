package call_by_value_of_reference;
// System.out.println(a);
//   swap(a, b); // it is primitives so no object are made in heap so no reference code are made no refelection can be made  via heap so no swap 
//   System.out.println(a);

// so we have to write methods like this as there is no reflection
//   System.out.println("before");
//   System.out.println(a);
//   System.out.println(b);

//   int temp = integer1;
//   integer1 = integer2;
//   integer2 = temp;
//   System.out.println("after");
//   System.out.println(a);
//   System.out.println(b);

// so there is any other approch to swap primitives


// we have to make objects


class wrapper{
    int value;

    

}

public class code3 {

     public static void main(String[] args) {
        wrapper a = new wrapper();
        wrapper b = new wrapper();

        a.value  = 100;
        b.value = 200;


        System.out.println("before swap"+" "+a.value+" "+b.value);
        swap(a, b);
        System.out.println("after swap"+" "+a.value+" "+b.value);

        //print referecnce hexa code
        System.out.println("referecnce hexa code of a b"+a+b);


     }


     static void swap(wrapper a,wrapper b){
        int temp = a.value;


        a.value = b.value;
        b.value = temp;
     }
}
