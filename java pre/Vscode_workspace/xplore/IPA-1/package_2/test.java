package package_2;
import package_1.*;
public class test {
    public static void main(String[] args) {
        package_1.test.happy();
        // package_1.x; cannot use local values of static happy method or any intsnace mehtod 
        package_1.test.main(args);

        package_1.test.a = 1;


        package_1.test ob = new package_1.test();
        ob.b = 1; // due to package not able to access it so made b as public
        ob.display();
    }
}
