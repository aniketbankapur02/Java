package u1classworkunal;

public class U1ClassWork1 {

    public static void main(String[] args) {
       String a = "hello";
       String b = "hello";

       String c = a;// c is assgined by a reference code
       // c is pointing to that object to where a is poiting



       String s1 = new String("hello");
       String s2 = new String("hello");

       String s3 = s1;//s3 is assigned by reference code of s1
       // so s3 point to the object in heap to which s1 points
       // both has same reference code 

    //    System.out.println("ref code of a : "+ a + " ref code of b : " + b); if array you would have got ref code
       System.out.println(a == b);// true as both are pointing to same literal in pool same reference code
       System.out.println(a.equals(b));// true as content also same
       
       System.out.println(a == c);// true as a and c points to same object as both has same reference code
       
    //    System.out.println("ref code of s1 : "+ s1 + " ref code of s2 : " + s2);
       System.out.println(s1 == s2);// false as both are pointing to diff object in heap diff reference code
       System.out.println(s1.equals(s2));// true as content is same

       System.out.println(s3 == s1); // true
       

        
    }
}