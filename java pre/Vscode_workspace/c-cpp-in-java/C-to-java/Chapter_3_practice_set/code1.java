
//Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
package Chapter_3_practice_set;

import java.util.Scanner;

class marks{
    int st_id;
    // int sub1_marks;
    // int sub2_marks;
    // int sub3_marks;
    

    int result_calculation(int st_id,int sub1_marks[],int sub_mark_total_marks[]){
        int result;
        int total_marks = 0;
        float total_percentage = 0;
        int total_sub_marks = 0;

        int percetage_sub[] = new int[3];
        for (int i = 0; i < sub_mark_total_marks.length; i++) {
            total_marks = total_marks + sub_mark_total_marks[i];
        }
        for (int i = 1; i <= percetage_sub.length; i++) {
            percetage_sub[i] = (sub1_marks[i] / sub_mark_total_marks[i])*100;
        }
        
        for (int i = 0; i < sub_mark_total_marks.length; i++) {
            total_marks = total_marks + sub_mark_total_marks[i];
        }

        for (int i = 0; i < sub_mark_total_marks.length; i++) {
            total_sub_marks = total_sub_marks + sub1_marks[i];
        }
        


         total_percentage = (total_sub_marks/total_marks)*100;

        for (int i = 0; i < percetage_sub.length; i++) {

            if (percetage_sub[i] < 35) {
                result = 0;
                return result;
            }
        }

        if ( total_percentage < 40) {
            result = 0;
            return result;
        }


        
       // return result;// why issue there is the case total percentage is cannot be true due to which it can not be initialized
        return 0;
    }
}

public class code1 {

     
    public static void main(String[] args) {
        int sub1_marks[] = new int[3];
        int sub_mark_total_marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sub_mark_total_marks.length; i++) {

            System.out.println("Enter the student"+i+" subj"+i+ " marks and total marks of subject");
            sub1_marks[i] = sc.nextInt();
            sub_mark_total_marks[i] = sc.nextInt();
        }
        sc.close();
      int k =   result_calculation(sub1_marks, sub_mark_total_marks);
    
      if (k == 1) {
        System.out.println("Pass");
      } else {
        System.out.println("fail");
      }

    }

    static int  result_calculation(int sub1_marks[],int sub_mark_total_marks[]){
        int result;
        int total_marks = 0;

        float total_percentage ;
        int total_sub_marks = 0;




        double percetage_sub[] = new double[3];
        for (int i = 0; i <  percetage_sub.length; i++) {
            // percetage_sub[i] = ((float)sub1_marks[i] / sub_mark_total_marks[i])*100;
            percetage_sub[i] = ((double)sub1_marks[i] / sub_mark_total_marks[i])*100;
            System.out.println(percetage_sub[i]);
        }
        
        for (int i = 0; i < sub_mark_total_marks.length; i++) {
            total_sub_marks = total_sub_marks + sub1_marks[i];
        }
        for (int i = 0; i < sub_mark_total_marks.length; i++) {
            total_marks = total_marks + sub_mark_total_marks[i];
        }

        


         total_percentage = ((float)total_sub_marks/total_marks)*100;
         System.out.println(total_percentage);

        for (int i = 0; i < percetage_sub.length; i++) {

            if (percetage_sub[i] < 35) {
                result = 0;
                return result;
            }
        }

        if ( total_percentage < 40) {
            result = 0;
            return result;
        }


        
       // return result;// why issue there is the case total percentage is cannot be true due to which it can not be initialized
       result = 1;
       return result;
    }

}
