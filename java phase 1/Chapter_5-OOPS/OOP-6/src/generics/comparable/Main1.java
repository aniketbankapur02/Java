package generics.comparable;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
int roll;
float marks;

Student (int roll,float marks){
    this.roll = roll;
    this.marks = marks;
}
 

 @Override
 public int compareTo(Student o) {
     int diff = (int)(this.marks - o.marks);
     /*
      if diff is 0 then marks are equal
      if diff is negative o marks is grater 
      if diff is possible this object marks is grator 
      */
     return diff;
 }

 @Override
 public String toString() {
     
    return this.marks + " ";
 }
    
}

public class Main1 {
    public static void main(String[] args) {
        Student obj1 = new Student(1,79.9f);
        Student obj2 = new Student(2,90.9f);
        Student obj3 = new Student(3,89.9f);
        Student obj4 = new Student(4,86.9f);
        Student obj5 = new Student(5,95.9f);


        // here error is coming bec of confusion of object which parameter  to take for  difference
        // so for that we have implemented comparable method 
        // if ((obj1 - obj2) < 0) {// if -ve the objec 2 is greater
        //     System.out.println(" obj2 is greater then obj 2");
        // }
        if (obj1.compareTo(obj2) == 0) {
            System.out.println(" obj2 is equal obj 2");
        }
        else if ((obj1.compareTo(obj2)) < 0) {// if -ve the objec 2 is greater
            System.out.println(" obj2 is greater then obj2");
        }else{
            System.out.println(" obj1 is greater then obj1 ");
        }


        Student[] arr = {obj1,obj2,obj3,obj4,obj5};
        System.out.println(Arrays.toString(arr));// we have to overide default toString to our toString method as default one will print hexacode
        Arrays.sort(arr);
        /*
        sort is based on marks parameter bec of comparable method
        ( https://www.youtube.com/watch?v=OY2lPr8h93U&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=55 check timestamp 45:54)
         Arrays.sort internally checking comparable method for no confusion
         Imp concept here arrays sort is based on comparable method
          if you remove comparable method it will give error bec of confusion like roll no or marks
          https://chatgpt.com/share/67f5714a-0190-8013-9383-f319d6d32200
         */
        System.out.println(Arrays.toString(arr));
 
        /*
         you can pust comparable in sort as well
         */


        Student[] array = {obj1,obj2,obj3,obj4,obj5};
        System.out.println(Arrays.toString(array));// we have to overide default toString to our toString method as default one will print hexacode
        // we can use Comparator
        System.out.println(Arrays.toString(array));

               Arrays.sort(array, new Comparator<Student>() { // wea re implementing interface so overriding method is important
           @Override
           public int compare(Student o1, Student o2) {// T is replace by Student
               return (int)(o1.marks - o2.marks);
           }
       });

       /*
        https://chatgpt.com/share/67f5714a-0190-8013-9383-f319d6d32200
        comprable vs comparator

        1)comprable fix comparing 
        2)in comparator you can make custom 

        sort usign comparator is done according to our conparable method logic
        during sort it does not take marks of object it takes differencce of object

        o1.marks - o2.marks if +ve then o1 markis greater then o2
        so o1 will comes first in sort bracket
        so this how sorting is done instead of directly choosing marks it takes diffrecne of marks for sorting


        -------
        during sort it does not take marks of object it takes differencce of object
        if <0 then object 2 is greater then object 1 and vice versa
        it is a bit confusing but its a good way to implement comparator

        so this is the difference between comparable and comparator

        https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
        https://www.youtube.com/watch?v=OY2lPr8h93U&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=55 check timestamp 45:54
        

        System.out.println(Arrays.toString(array));// we have to overide default toString to our toString method as default one will print hexacode

        
        so in short if you want to sort using custom logic use comparator and if you want to sort using default logic use comparable
        ---------

        */


    }
}
