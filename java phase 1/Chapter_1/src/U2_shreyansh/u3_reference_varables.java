package U2_shreyansh;

class Employee{
    int Emp_id ;
    final static float CONSTANT = 3.14f; // now no object can chnage this due to final

    /*
     final for constant
     static for shared memory of constant so that it is used by all objects

     final -> access but cannot change
     private -> no access so cannot change

     static is only made in class as class member
     */

    static void modify(Employee e){
        e.Emp_id = 2;
        // static int i = 1; // static defining is illegal  in method 
    }
}
public class u3_reference_varables {

    public static void main(String[] args) {
        //---------1 class reference variable
        Employee e1 = new Employee();
        e1.Emp_id = 1;
        /*
        e1 is local class reference varibale which stores hexacode of object which is in heap
        default value for local variable (no null is given) is not given so new is imp to initlize  
        */ 
        int b ; // b is not reflected when we do pass by value so use wrapper class for reflection like Integers 
        // pass by vlaue of reference
        System.out.println(e1.Emp_id);
        Employee.modify(e1);
        System.out.println(e1.Emp_id);
        /*
         modified by e2 by accessing object 
         whoever pointing to that object in heap will have updated onject
         as e1 is pointing to that object it will have updated object that is 2
         */

        Employee e3 = e1;
// now e3 is also pointing to that object
// if e3 changes emply id whoever pointing to that object in heap will have updated object
        System.out.println(e3.Emp_id);

        System.out.println(e1.Emp_id);
        e3.Emp_id = 10;
        System.out.println(e1.Emp_id); // e3 changes so e1 is having updated value


        //---------2 string reference variable

        /*
         1) string pool in heap is for string literal which does memory optimize by assigning same hexacode 
         to all ref_var which holds same string literals
         2) normal heap is for string objects here it does not give same refernce code to all ref variable having same string
         so no memory optimization
         here all ref varibale will have unique code even for same string objects
         */

        String s1 = "hello";// string literal
        /*
         s1 is local variable which holds hexacode of hello string literal which is in string pool
         */

         String s2 = "hello";
        
         /*
         s2 is local variable which holds same  hexacode of hello string literal which is in string pool

         how it works
        1) first java see there is hello in string pool or not 
        2) if there it gives same hexacode to s2
        3) if not it will make new hello

        this technique helps to optimize memory this concept is only string pool heap which is not in normal heap
         */

         /*
          to test hexa code is same or not we can use == for comparing hexacode
          to test content we can use equal method
          */

          if (s1 == s2) {
            System.out.println("hexacode of s1 and s2 is same");
          }
          if (s1.equals(s2)) {
            System.out.println("contents of s1 and s2 is same");
          }

          /*now string objects
           1) here string is not allocated in string pool literal 
           2) instead it is allocated in heap
           3) no same reference code is given to ref_var for same string objects
           */

           String str1 = new String("hello");// this hello is in normal heap (outside string pool)
           String str2 = new String("hello");// this hello is in normal heap (outside string pool)

          /* normal heap is for string objects here it does not give same refernce code to all ref variable having same string
         so no memory optimization
         here all ref varibale will have unique code even for same string objects
         */
        if (str1 != str2) {// str1 referece code is not equal to str2 which is true therefore it satifies condition 
            // if str1 and str2 is same it will not satifies
            System.out.println("hexacode of str1 and str2 is not same");
          }

          if (str1 == str2) {// str1 referece code is not equal to str2 which is true therefore it satifies condition 
            // if str1 and str2 is same it will not satifies
            System.out.println("hexacode of str1 and str2 is not same : due to this condition is never satified and this statement is never printed");
          }
          if (str1.equals(str2)) {
            System.out.println("contents of str1 and str2 is same");
          }


          /*
           string are immutable java never changes value of string
           :-
           */
          
           System.out.println(s1);
           s1 = "Aniket";
           System.out.println(s1);
        /*
         now hello is still there in string pool
         java first checks there is any Aniket string in string pool if not it will make and 
         gives reference code to s1
         here java makes new string Literal of aniket instead of modifying hello
         and gives hexacode of Aniket to s1
         so now s1 points to new string literal previously it was pointing to hello now it points to Aniket string literal
         
         same case for string Objects

         string litrals and string objects are both immutable
         difference is just in location and memory optimization
         */

         /*
          if no one is pointing to hello GC will clean it
          */


          //3)------------array

          int arr[] = new int[4];

          // arr is local reference varibale instack which stores hexacode no default for arr if unassigned
          // 4 continious object block is made in heap 
          // 4 object will have default value as storage is heap 

          String s  =  "a";
          // s is local refernce vairbal in stack which stores hexacode of string literal no default value  for s if unassigned

          int arr2[] = {1,2,3};// 1,2,3 is stored in heap only default behavior is new only
          // arr is local reference varibale instack which stores hexacode no default for arr if unassigned
          /*
           Stack                          Heap
+-------------------+          +-------------------+
| arr2 (reference)  | -------> | Array Object      |
+-------------------+          +-------------------+
                                | Index 0: 1        |
                                | Index 1: 2        |
                                | Index 2: 3        |
                                +-------------------+
              */

              /*
               later enum,interface,wrapper class implementation
               */


    }
}
