package interfaces.example;
interface Brake {
    void brake();
}

interface Engine {
    static final int PRIZE = 70;// if you dont mention static final it is fine as every field is static final by default
    void start();
    void stop();
    void acc();
}

interface Media {
    void start();
    void stop();
}

// we can do multiple inheritence if method are unique
// we can do with Engine Brake and Media, Brake
// cannot do with Engine and Media toghter bec of confusion which method to override Engine method or Media method
public class Example1 implements Brake,Engine{
/*
 now i can implement from two inerfaces which was not possible in inherience
 */

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void start() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void acc() {
        // TODO Auto-generated method stub
        
    }
}
