package U1_practice_kunal;
//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

/*
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

Simple Interest Formula
Simple interest is calculated with the following formula: S.I. = P × R × T, where P = Principal, R = Rate of Interest in % per annum, and T = Time, usually calculated as the number of years. The rate of interest is in percentage r% and is to be written as r/100.

Principal: The principal is the amount that initially borrowed from the bank or invested. The principal is denoted by P.
Rate: Rate is the rate of interest at which the principal amount is given to someone for a certain time, the rate of interest can be 5%, 10%, or 13%, etc. The rate of interest is denoted by R.
Time: Time is the duration for which the principal amount is given to someone. Time is denoted by T.
Amount: When a person takes a loan from a bank, he/she has to return the principal borrowed plus the interest amount, and this total returned is called Amount.
Amount = Principal + Simple Interest */
public class u1_practice2 {
    
    static float Simple_interest_increaing_rate(int P,int R,int T){

        float SI = 0,S = 0;
        while (T > 0) {
            S = P * (float)R/100;
            SI = SI + S;
            T--;
            // P = P + S;
            R = R + 2;
        } 
        return SI;
    }
    static float SI2(int P, int R, int T) {

        // float SI = P * ((float) R / 100) * T;
         float sum_SI = 0;
        for (int time = 1; time <= T; time++) {
            if (time > 1) {
                R = R + 2;
                sum_SI = sum_SI + P * (((float) R / 100));
            }else{
                sum_SI = sum_SI + P * ((float) R / 100) ;

            }
        }
      

        return sum_SI;

    }

      // rate on chaning amount in above case amount was constant here amount is changed and interest rate is on changing amount 
      static void SI3(float P, int R, int T) {

        // float SI = P * ((float) R / 100) * T;
         float sum_SI = 0;
         float principle = P;   
        for (int time = 1; time <= T; time++) {
            if (time > 1) {
                R = R + 2;
                // sum_SI = 0;
                sum_SI = sum_SI + principle * (((float) R / 100));
                principle = principle + sum_SI;
            }else{
                sum_SI = sum_SI + principle * ((float) R / 100) ;
                principle = principle + sum_SI;

            }
        }
      

        System.out.println("SI_sum :" + sum_SI);
        System.out.println("amount "+ (P + sum_SI));

    }
    static float Simple_interest_increaing_rate_n_principle(float P,int R,int T){

        float SI = 0,S = 0;
        float Principal = P; 
        while (T > 0) {
            S = P * (float)R/100;
            SI = SI + S;
            T--;
            P = P + S;
            R = R + 2;
        } 
        System.out.println("New code amount" + (SI + Principal) );
        return SI;
    }




    static float Simple_interest_fix_rate(int P,int R,int T){

        float SI = P * (float)R/100 * T;
        return SI;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // in is null ie to take input from keyboard
    

    System.out.println("Enter P R T");
    int P = sc.nextInt();
    int R = sc.nextInt();
    int T = sc.nextInt();


    System.out.println("fix rate"+Simple_interest_fix_rate(P, R, T));
    System.out.println("increasing rate new code "+Simple_interest_increaing_rate(P, R, T));
    System.out.println("increasing rate old code "+SI2(P, R, T));


    System.out.println("increasing rate n principle new code "+Simple_interest_increaing_rate_n_principle(P, R, T));
    System.out.println("increasing rate n principle old code ");
    SI3(P, R, T);
    
    
    sc.close();

    }
}
