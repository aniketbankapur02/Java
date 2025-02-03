package u3_more_practice;
/*
 LCM
 approach (LCM 2nd method)
 Division Method or Ladder Method of Finding LCM
In this method, the two numbers are simultaneously divided with prime numbers until the division is even. 
When there are no more primes that evenly divide into both numbers, multiply the divisors to get the LCM. For example:
 */
/*
 Program to check if a triangle is scalene, isosceles or equilateral.
 Coding Exercise: Exam Result Checker (easy if marks > 50 then pass else fail)
 Coding Exercise: Sum of Squares of First N Numbers
 Coding Exercise: Is Valid Triangle
 Coding Exercise: Is Right Angled Triangle
 Coding Exercise: Is Leap Year
 Coding Exercise: Weather Advisor
 Java For Loop - Exercise - Sum Upto N Numbers and Sum of Divisors



// during patterns
 Pascal Triangle 1) right angle triangle (nCr approach) 2) pyramid (DP approach why no nCr bec to print pyramid we have to use spaces due to spaces we cannot take previous nCr ) 
 
 Quick questions on functions (during bitwise)
1) Sum of first n natural numbers 
2) Check pythagorian triplet 
3) Conversions 
  a) Binary to decimal 
  b) Octal to decimal 
  c) Hexadecimal to decimal 
  d) Decimal to binary 
  e) Decimal to octal 
  f) Decimal to hexadecimal 
4) Add two binary numbers
 */
import java.util.Scanner;

public class Practice1 {

    static boolean checkPrime(int n){  
        int i,m=0;      
        m=n/2;      
        if(n==0||n==1){  
        return false;      
        }else{  
         for(i=2;i<=m;i++){      
          if(n%i==0){      
        return false;      
        // flag=1;      
                 
        //    break;      
          }      
         }      
       return true;   
        }//end of else  
      }  
    
    static int lcm(int n,int m){
    int ans = 1;
    int i = 2;
    boolean flag = false; 
    // int Q1,Q2 = 0;
    while ( !(m == 1) || !(n == 1)) {// until both turns false it runs

        // if (!checkPrime(i)) { // skip for non prime numbers
        //     i++;
        //     continue;
        // }
        
        if ((n % i == 0) ) {
            n = n/i;
            // System.out.println(n);
            flag = true;
        }
        if ((m % i  == 0)) {
            m = m/i;
            // System.out.println(m);
            flag = true;
        }
        if (flag == true) {
            ans = ans * i;
            flag = false;
        }
        if (((n % i != 0)) && ((m % i != 0)) ) {
            // System.out.println(" "+i);
            i++;
        }
    }
    
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(lcm(n, m));
        sc.close();
    }
}
