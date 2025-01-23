package U2_shreyansh;
// best practices
public class u1_variables{
    final static float PI = 3.14f; // use captials vairable
    //  i think there is no const keyword thats why we use final
    // static foro universal use 
    public static void main(String[] args) {
    
        // in general varibale are small only
        // only constants are capital
        // and if second word joins in use camel case
        float PI = 3.14f;
    
        int $hi; //allowed
        int _hi;
        int hi;

        int hiHelloHowAreYou; // if second third .... word joins use camel case for it

        /* in nidustry we never use float and double as it cuts decima point due to its format
         we use wrapper class like BigIntegers
         below i am printing value of f and d
         */

         float f1 = 0.3f - .2f;

         System.out.println(f1);

         float f2 = 0.7f;

         
         System.out.println((double)f2);// type cast smaller to bigger value is cuff of why 

         /*
          usually in smaller to bigger value is not cuff
          thats why it is never used in industry 
          to know how it works see shrayansh lecture 5

          like byte(111) to short(111)
          but in smaller to bigger value is cutoff
          like short(145) t0 byte(-111) acc to his range
          */

         

    }
}