package u5_part2.u1_operator;
// arithmatic operators
public class u1_operator1 {
    public static void main(String[] args) {

        System.out.println(5.0/2);
        System.out.println(5.0+2);
        System.out.println(5.0-2);
        System.out.println(5.0*2);
        System.out.println(5%2);
        System.out.println(-5%2);// - sign remains
        // % cannot be done to float

        int a = 1;
        int b = 2;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);

        System.out.println(a == b);
        System.out.println(a != b);

        // logical operator is used to combine two or more condition

        System.out.println((a>b) || (a < b));// if 1 st condition is true it returns true without even checking 2 nd condtion
        System.out.println((a>b) && (a < b));// if 1 st condition is false it returns false without even checking 2 nd condtion

        // unary operator

        System.out.println(a++);//1 phele use then evaluate kare// eqivalent evaluation  a = a + 1
        System.out.println(++a);//3 phele evaulte kare then use kare

        System.out.println(!true);

        System.out.println(-a);//-3

        System.out.println(-a);//3 as - - is +

        // assignmment operator

        
        System.out.println(a);// system is class out is ref_var of printstream class 
        // out is static variable
        // println is non static member function of printstream that why we created ref_var(out in System) 

        System.out.println(b += 5);// b = b + 5 // phele evaluate hoga then b print hoga

        // ternary operator

     int m = (a > b) ? a + 1 + b + 1 : b; // ? exp 1 : exp 2
     // after ?   : there will be only exp only 
     
     
     // instance of operator

     String ref_var1 = "hell0";
     u1_operator1 ref_var2 = new u1_operator1();

     System.out.println(ref_var1 instanceof String);
     System.out.println(ref_var2 instanceof u1_operator1);




        







    }
}
