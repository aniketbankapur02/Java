package interfaces;

public class CarMedia implements Media {
    @Override
    public void start(){
        System.out.println("media start");
    }
    @Override
    public void stop(){
        System.out.println("Media stop");
    }
}
