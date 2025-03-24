package interfaces;

public class Main {
    public static void main(String[] args) {
        // custom car created problem which method to call which is solved by CustomCar2
        CustomCar maruti = new CustomCar();
        maruti.start();
        maruti.acc();
        maruti.stop();

        CustomCar2 tata = new CustomCar2();
        // below are the funcationality we can use it via ui buttons
        tata.carSart();
        tata.carStop();
        tata.carAcc();
        tata.carBrakeStart();
        tata.carBrakeStop();
    }
}
