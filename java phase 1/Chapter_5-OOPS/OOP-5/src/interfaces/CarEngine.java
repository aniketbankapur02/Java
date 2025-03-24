package interfaces;

public class CarEngine implements Engine{
    @Override
    public void start(){
        System.out.println("car engine start");
    }
    @Override
    public void stop(){
        System.out.println("car engine stop");
    }
    @Override
    public void acc(){
        System.out.println("car engine accelerate");
    }
}
