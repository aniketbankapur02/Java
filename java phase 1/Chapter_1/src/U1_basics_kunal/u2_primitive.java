package U1_basics_kunal;
/*
to do 
src thing and debugger tool which runs code line by line to to analyze which line has bug 

topics
variables identifiers literals
data types
deafult once in real is double to avoid floating reducing error
typecasting

read durga soft notes and gpt
operators
expressions rules etc
asso and precendence 

*/


public class u2_primitive {

    public static void main(String[] args) {
        int roll = 4;

        // long hi1 = 111111111111; 111111111111 is still is int type bec of default beahvior 
        //and this 11111111 cannot be stored in long even if long space is enough to store 111111 bec 11111 type is int
        long hi2 = 1111111111111111111L;// now 111111111111111 is in long type bec of L and now 1111.. is eliglble to be stored in long type

        // similar for decimal numbers 
        // default is double
        // why double is default why not float like int 
        // bec java recommands double for decimal numbers for accurancy calculations
        
        // float real = 9.99; // 9.99 is double canot be stored in float
        float real = 9.99f;// now 9.99 is float bec od explicit menstioning via f

        boolean check = true; // or flase
        


    }
}
