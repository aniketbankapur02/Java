package u5_part2.u3_mathsclass;
/*
 reading tutorial
 https://www.w3schools.com/java/java_math.asp
 https://www.w3schools.com/java/java_ref_math.asp (do check in detail by clicking it)

 All methods of Math class are static 
 use it like Math.pow();
 all are having return type none are void s
 assign it or simply print it
 */

import java.util.Random;

public class U1_MathsPractice{
    public static void main(String[] args) {
        int maxValue = Math.max(3, 02);
        int minValue = Math.min(3, 02);

        double squareRoot = Math.sqrt(64); // return type is double you can ref doc
        // as desination is bigger do explicit type conversion

        int absoulutePositive = Math.abs(-44);// return type int 
        double absoulutePositive1 = Math.abs(-44);// return type int
        // you can implcitly type cast in long float double
        // if - value then it retuns + value if + value it returns + value only

        // random using maths -> random()	Returns a random number between 0 and 1	double

        double random1 = (Math.random() * 100); // 0 to 100;// return is double

        // we dont want in double so type cast it

        int random2 = ((int)Math.random() * 100); // 0 to 100;// return is double so we explcitly typecast it into int
// doubel and float sucks bec of precision errors and decimal point computation
        Random r = new Random();

        int random3 = r.nextInt(100); // return in int bec of nectInt and random value range is from 0 to 100 
        int random4 = r.nextInt(); // DEFAULT IS MAX value of int ie -2^31 to 2^31 1 bit is for sign that why 31   return in int bec of nectInt and random value range is from   MIN_VALUE to MAX_VALUE

        System.out.println(random3 + " " + random4);

        // round off helps in random math and pow
        // greater than 0.5 will be prompted to 1
        // 0.4 ~ 0
        // 0.5 ~ 1
        float f1 = 1.222231111112222f; 

        float roundOff1 = Math.round(f1); // 1.222231111112222f ~ 1
        System.out.println(roundOff1);
        
        
        float f = 1.522231111112222f;

        float roundOff = Math.round(f); // 1.522231111112222f ~ 2 
        System.out.println(roundOff);


        // pow(x, y)	Returns the value of x to the power of y	return type double

        // first round then  explicit type it imp here bec return is double  also do +1 fro higher compuatation
        // public static double pow(double base, double exponent)

        double power = Math.pow(4,0.5 );//if int  parameter will implcitly type cast to double (0.5 is square root)

        System.out.println(power);
        
        
                int power1 = (int) Math.round(Math.pow(4,0.5 ));//if int  parameter will implcitly type cast to double
        
                System.out.println(power1);




        
        
        
    }
}