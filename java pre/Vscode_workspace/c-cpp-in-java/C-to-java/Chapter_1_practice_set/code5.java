//Q4. Write a program to calculate simple interest for a set of values representing principle, no of years, and rate of interest.

/*Simple Interest Formula
Simple interest is calculated with the following formula: S.I. = P × R × T, where P = Principal, R = Rate of Interest in % per annum, and T = Time, usually calculated as the number of years. The rate of interest is in percentage r% and is to be written as r/100.

Principal: The principal is the amount that initially borrowed from the bank or invested. The principal is denoted by P.
Rate: Rate is the rate of interest at which the principal amount is given to someone for a certain time, the rate of interest can be 5%, 10%, or 13%, etc. The rate of interest is denoted by R.
Time: Time is the duration for which the principal amount is given to someone. Time is denoted by T.
Amount: When a person takes a loan from a bank, he/she has to return the principal borrowed plus the interest amount, and this total returned is called Amount.
Amount = Principal + Simple Interest */
package Chapter_1_practice_set;


import java.util.Scanner;

public class code5 {

    static float SI(int P, int R, int T) {

        float SI = P * ((float) R / 100) * T;

        return SI;

    }
    // rate increases
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
    static void SI3(int P, int R, int T) {

        // float SI = P * ((float) R / 100) * T;
         float sum_SI = 0;
         float amount = P;
        for (int time = 1; time <= T; time++) {
            if (time > 1) {
                R = R + 2;
                sum_SI = 0;
                sum_SI = sum_SI + amount * (((float) R / 100));
                amount = amount + sum_SI;
            }else{
                sum_SI = sum_SI + amount * ((float) R / 100) ;
                amount = amount + sum_SI;

            }
        }
      

        System.out.println("SI_sum :" + sum_SI);
        System.out.println("amount"+ amount);

    }

    static void amount(float SI,int Principal_amount) {
     int amount  = (int)(SI + Principal_amount);

     System.out.println(amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter P R T");
         
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();

        sc.close();

        float SI = SI(P,R,T);
        float SI2 = SI2(P,R,T);
       System.out.println("SI :" + SI);
       System.out.println("SI :" + SI2);
       amount(SI,P);
       amount(SI2,P);
       SI3(P, R, T);
    }
}
