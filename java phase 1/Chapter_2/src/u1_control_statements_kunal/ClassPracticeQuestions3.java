package u1_control_statements_kunal;
//Q4 : Counting occurrences of xyz number in given number

// example number = 1385757879 so how many times does 7 (input by user) occur in given number 

import java.util.Scanner;

/*
input
 number = 1385757879
 n = 7
 output
 count : 3

 */
public class ClassPracticeQuestions3 {
    static void countOccurenceNumber(int number, int n) {
        int counter = 0;
        while (number > 0) {
            if (number % 10 == n) {
                counter++;
            }
            number /= 10;
        }
        System.out.println(counter);
    }
    static void countOccurenceString(String string, char c) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) { // checing of asic value
                counter++;
            }
        }

        System.out.println(counter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();

        countOccurenceNumber(number, n);
        String string = sc.next();
        char c = sc.next().charAt(0);

        countOccurenceString(string, c);

        sc.close();
    }
}
