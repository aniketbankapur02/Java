package u1classwork;
// even wrapper class wont be swapped as we are not accessing object via . operator
// just object refernece code is swapped locally as object value is not changed in heap main wrapper value is not changed
//  to change you have to use . operator which you can see in my function pass by value of refernce code


public class U4ClassWork {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
    }

    static void swap(Integer a,Integer b){
        System.out.println(a + " " + b);
        Integer temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
