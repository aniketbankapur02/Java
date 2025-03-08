package u1classwork;

class Student {
int rno;
String name;
float gpa;
    
}

public class U2ClassWork {
    public static void main(String[] args) {
        // Student s1; error when you print as there is no default for local reference variable
        Student s1 = null;// no error when you print as i have explicitly given a default value
        System.out.println(s1);
    }
}
