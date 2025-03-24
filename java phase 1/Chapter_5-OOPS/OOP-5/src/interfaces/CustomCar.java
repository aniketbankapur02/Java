package interfaces;


interface Brake {
    void start();
    void stop();
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

public class CustomCar implements Brake,Engine,Media {

    @Override
    public void acc() {
        System.out.println("acc a car");
    }

    @Override
    public void start() {
        System.out.println("starting a cars");
    }

    @Override
    public void stop() {
        System.out.println("stopping a car");
    }
    /*
     problem here (bec of three implementation) is there is start and stop for media and engine as  well how to override for them?
     we have to make individual classes for that
     thats why i implemented CarBrake CarMedia CarEngine individually
     */

    
}