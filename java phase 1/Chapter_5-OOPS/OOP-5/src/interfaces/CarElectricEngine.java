package interfaces;

public class CarElectricEngine implements Engine{
    @Override
    public void start(){
        System.out.println("car electric engine start");
    }
    @Override
    public void stop(){
        System.out.println("car electric engine stop");
    }
    @Override
    public void acc(){
        System.out.println("car electric engine accelerate");
    }
}
