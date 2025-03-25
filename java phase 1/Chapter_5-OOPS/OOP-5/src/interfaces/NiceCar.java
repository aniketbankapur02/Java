package interfaces;

public class NiceCar {
    private Engine engine;
    private Media media;
    
    //constructor
    // for every instance iniluze with CarEngine

    public NiceCar(){
        // parrent    // child
        engine = new CarEngine();//CarEngine should implement Engine interface then only parent interface ie engine can hold child reference code
        media = new CarMedia();
    }
    // constructor overloading 
    public NiceCar(Engine engine){
        this.engine = engine;// it can be anything CarEngine or ElectricEngine
    }

    void startEngine(){
        engine.start();// this is method of Car engine
    }

    void stopEngine(){
        engine.stop();// this is method of Car engine as default inilzation for engine object is of CarEngine
    }
    void startMedia(){
        media.start();// this is method of Car Media as default inilzation for media object is of CarMedia
    }

    void stopMedia(){
        engine.stop();//  this is method of Car Media as default inilzation for media object is of CarMedia
    }
    // good funcationality you can upgrade your engine
    void upGradeEngine(){
        this.engine = new CarElectricEngine();//CarElectricEngine should implement Engine interface then only parent ie engine interface can hold child reference code  
    }
}
