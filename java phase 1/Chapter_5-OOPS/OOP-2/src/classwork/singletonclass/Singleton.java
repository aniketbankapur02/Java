package classwork.singletonclass;

public class Singleton {
    // we dont allow others public people to create instance as singleton class has only one instacne
    // and that also we are creating that one instance here

    // private constructor
    private Singleton(){

    }
    // so anyone want to create object that cannot create it instead everyone has to use the same one instance tht we are creating here

    // this is only one instance we are making if anyone wants to create instacne of this class they cannot do that instead the have to use this instance
    private static Singleton instance;

    // so how to pass above instance just make get method in static to so that they should get this instacnce without creating object

    public static Singleton getInstnace(){
        if(instance == null){// if that one instance is null then create object for that
            instance = new Singleton();// constructor is private it can be used here only
        }
        // if instance has been created then pass that instance
        return instance;
    }

}
