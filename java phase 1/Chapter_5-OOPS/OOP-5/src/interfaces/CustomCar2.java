package interfaces;

public class CustomCar2 {
    Engine engine = new CarEngine();
    Brake brake = new CarBrake();
    Media media = new CarMedia();

    public void carSart(){
        engine.start();
    }
    public void carStop(){
        engine.stop();
    }
    public void carAcc(){
        engine.acc();
    }

    public void carBrakeStart(){
        brake.start();
    }
    public void carBrakeStop(){
        brake.stop();
    }
    // same for media
}
