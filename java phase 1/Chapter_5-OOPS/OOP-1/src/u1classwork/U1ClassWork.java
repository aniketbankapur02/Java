package u1classwork;

class Student {
    int rollNo;
     String name;
     int marks;

}

public class U1ClassWork{
    public static void main(String[] args) {
        //why we need oops
        // here is the example of unorgize data for student entity

        
        int[] student_roll_no = new int[4];
        String[] student_name = new String[4];
        int[] marks = new int[4];
        
        // here marks is attached with student rollno
        // so to connect this all we can make our own custom datatype where we connect all this feilds to one template 
        // so that can we give all this field to one entity


        // so we have made template
        // we can make student entity array
        // where student[0] student[1] student[2] are the objects/instance/entity

        Student[] students = new Student[4];// array declaration

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();//inilization of array object in heap
        }

        //students[0] is local reference variable that need to stores reference code
        // example
        students[0] = null;// null if you dont want to assign reference code from heap 
        //or
        students[0] = new Student();

        // as it is local reference variable it should have some value
        
        
        // above obj[0] is been aloocated in heap
        // now assign values via . operator
        // any access is done via . operator

        students[0].rollNo = 1;
        students[0].name = "String";
        students[0].marks = 1;

        // refer BTS via diagram made in notebook

        System.out.println(students[0].marks);
        


    }
}