package classwork.polymorphism;

/*
 in java by default every class is extended by parent class ie object class
 when we print object of this class ie OverrideExample we get hash code which we get via toString method of object class
 if we want to execute our toString method so that you wont get hashcode we can override object class toString method
 
 */
public class OverrideExample {
    int num;

    OverrideExample(int num) {
        this.num = num;
    }

    // if i comment this method it will call parents object and hexacode is printed
    @Override // not giving compile time error as it overrides parent class object
    public String toString() {// when you right click it it points to parent object to string as it is compile time and overrides happens during runtime so our method is executed in runtime so pointing to our toString happens at run time
        return "" + this.num;
    }
    public static void main(String[] args) {
        OverrideExample ref = new OverrideExample(10);
        System.out.println(ref);// we will get hexacode to avoid this we can override it
    }

}
