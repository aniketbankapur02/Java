package objectclass;
// object class is parent of all class
// lets override method of object class
// rule for override is you cannot change any syntax for it

/*
 we can override parent class methods
 */
public class ObjectDemo {
    int num;
    int number;
    ObjectDemo(int num,int number){
        this.num = num;
        this.number = number;
    }

    // lets override hashcode method
    /*
     hasdcode is unique for every for object
     now lets override to our hash code
     we have overrided hascode we send num value instead of hexcode 
     */
    @Override
    public int hashCode() {
        return this.num;
    }
/*
 lets override equals method
 equal method checks content of any value primitives or non primitives
 we making equal method based on object num value
 */
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }


    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(23,11);
        ObjectDemo obj2 = new ObjectDemo(32,22);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.hashCode());//23
        System.out.println(obj2.hashCode());//32

        if (obj1.hashCode() < obj2.hashCode()) {// some random values it might happen random value of obj 1 can be less than random value of obj2
            System.out.println("Object 1 is less than object 2");
        }

        // if (obj1 < obj2) {//error does not work as > < operator is not for hexa code numbers somthing it works for decimal numbers
        //     System.out.println("Object 1 is less than object 2");
        // }

        // for hexadecimal numbers == operator can work
        
        if (obj1 == obj2) {// comparison hexacode compariosn will always false until and unles storage is in string pool as every object gets unique object code in heap
            System.out.println("Object 1 == object 2");
        }
        if (obj1.equals(obj2)) {// here comparision happens between content not hexcode so might be true
            // if thier num values is equal below will be printed 
            System.out.println("Object 1 == object 2");
        }


        System.out.println(obj1 instanceof ObjectDemo);// returns T or F so it is T
        System.out.println(obj1.getClass());// returns class name
        System.out.println(obj1.getClass().getName());// returns class name
        /*
         above getClass() is method member of all parent class object
         so you can use with any instance as every class is inhierited by parent object so you can use it or override it 
         */
        // obj1.getClass(). you can explore methods via .
    }
}
