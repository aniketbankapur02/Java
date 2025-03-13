package u1classwork;


class A {
    int a;   
    final int b  = 1;
}
public class U6ClassWork {

 public static void main(String[] args) {
    final int A = 10;
    final int B ;// should be ininlized
    // A = 10; it will not happend
    // constant varibale should in captiable varibales

    final A ref_var = new A();// final used for reference variable

    A obj = new A();

// ref_var = obj; wont work remove final it will work
// OR

// ref_var = new A(); wont work remove final then it iwll work

// but instance variable are not final so you can change until thery are final

ref_var.a = 1;
// ref_var.b = 2; error
 }   
}
