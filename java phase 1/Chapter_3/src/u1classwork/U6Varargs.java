package u1classwork;

public class U6Varargs {
    public static void main(String[] args) {
        fun(1,2,3,4,55,6,7,7,7,45,45,45,67,34,56,2,3);// unlimted arg is also fine
        //fun(null);// you can even as null to array as it reference variable it can have null value or even empty array
      //  fun(); // vargs is fexlible even if you dont give it is fine
//but dont use vargs in that method as it is null using null things java throws null pointer pointer exception
// best practice is to give some value if var ags is there as parameter
        //for null value 0 is not printed as array is not allocated bec of null so no 0 values are made

        fun1(1, 2, 3,4);// args must be passed in order as first goes to a and second goes to b and everything after b goes to array
        // fun2(0);// not fine for normal parameters value b should be given vargs is fexliable it is fine if it is not given
        fun2(0, 0);// fine but dont use vargs in that method as it is null using null things java throws null pointer pointer exception
        
        fun2(1, 2, "String1","String2");// please proper order according to method parameter
    
    }

    static void fun(int ...vars){// one parameter can store unlimited argumnets and interanlly it stores all arguments as array of values
        // System.out.println(vars[1]);
        for (int i = 0; i < vars.length; i++) {
            System.out.println(vars[i]);
        }
    }
    static void fun1(int a,int b,int ...x){// first two int value is given to a and b
        System.out.println( a + " " + b + " " + x[1]);
    }
    static void fun2(int a,int b,String ...x){// first two int value is given to a and b
        System.out.println( a + " " + b);// dont use var ags if it is null
    }

    // static void fun2(int a,int ...vars,int b){// vargs should be at end as it will take all int values and it will not leave anything for b as he dont know that there is b beside him
                                                // so thats why it is written at end

    // }
}
