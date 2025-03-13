package u1classwork;
// constructor
/*
 syntax
 Class name no name for method no need to define type 

 may be constructor are always public
 */
class Student{
    int rno = 44;// default value will be changed as you have called constructor
    String name;
    float gpa;


// non parameter constructor
    // Student(){
    //     this.gpa = 1;
    // }
//  parameter constructor
    // Student(int gpa){
    //     this.gpa = gpa;// this is imp here bec it helps tp differiate between local and object value
    //     //if gpa = gpa will not work as it replacing local by local value
    // }

    // this is not a best practice take parameter as rno and assign instance varibale using this
    Student(int ID){
        rno = ID;// will work fine now we dont need this as there is no need to differiate between local variable and instance varibale
    }

    Student(int rno,String name,float gpa){
        this.rno = rno;
        this.name = name;
        this.gpa = gpa;
    }
    // Student(int gpa){
    //     gpa = gpa;
    // }

    // this constructor copies values of other object
    // just pass object and value will be assigned
    Student(Student ref){
        this.rno = ref.rno;
        this.name = ref.name;
        this.gpa = ref.gpa;

    }
    // calling constructor from another constructor
    Student(){
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this(2,"default values",9.5f);// calling 3 paramter constructor it will assign three values
    }

    // Student(){
    //     this(1,"aniket",9.6f);
    // }

}

public class U3ClassWork {

    // if you dont make constructor java calls default constructor assigning deafult values to it
    public static void main(String[] args) {
        Student s1 = new Student(1);

        // you can do constructor overloading as well for calling constructor according to number of parameter

        Student s2 = new Student(2,"Aniket",9.5f);// explcit type cast is imp double to float
        Student s3 = new Student(1);
        System.out.println(s1.rno);

        Student s4 = new Student(s2);

        System.out.println(s2.name + " " + s4.name);// value is same as we have assigned same thing


        // caaling a constructor from constructor

        Student s = new Student();

        System.out.println(s.name);// it will call constructor of s2 value will be of your choice

        Student one = new Student(1,"Something",1.1f);
        Student two = one;
        // now two also points to same object to which one points

        System.out.println(two.name);// prints Something


    }
}
