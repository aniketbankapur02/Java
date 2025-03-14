package classwork.singletonclass;

public class UseSingleton {
    public static void main(String[] args) {
        // if one wants to create instane they cannot do that they had to get that one instance only
        // Singleton obj1 = new UseSingleton();// error you have to get that on instance dont make new object
        Singleton obj1 = Singleton.getInstnace();
        Singleton obj2 = Singleton.getInstnace();
        Singleton obj3 = Singleton.getInstnace();
        // all three reference variable has one reference code that we created in singleton class 
    }
}
