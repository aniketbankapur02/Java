package interfaces;

public class CarBrake implements Brake{
    @Override
    public void start(){
        System.out.println("car Brake start");
    }
    @Override
    public void stop(){
        System.out.println("car brake stop");
    }
}


