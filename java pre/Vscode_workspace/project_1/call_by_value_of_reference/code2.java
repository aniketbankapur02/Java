package call_by_value_of_reference;

// C:\code\prog_lang\Vscode_workspace\project_1> 
// javac call_by_value_of_reference/code2.java

// we have made package so while giving to JVM give class in package format
//package_name.class_name
// java call_by_value_of_reference.code2

// if package made mentsion class with package 

class Game {
    GameType gameType;

    // Constructor
    public Game(GameType gameType) {
        this.gameType = gameType;
    }

    // Getter for gameType
    public GameType getGameType() {
        return gameType;
    }

    // Setter for gameType (optional)
    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }
}

// Enum to represent different game types
enum GameType {
    RPG, // Role-Playing Game
    STRATEGY, // Strategy Game
    ACTION, // Action Game
    SIMULATION // Simulation Game
}

public class code2

{
    public static void main(String[] args) {
        int a = 100;
        int b = 999;

        System.out.println(a);
        swap(a, b); // it is primitives so no object are made in heap so no reference code are made
                    // no refelection can be made via heap
        System.out.println(a);

        Game ageOfEmpires = new Game(GameType.STRATEGY);
        Game wow = new Game(GameType.RPG);

        System.out.println(ageOfEmpires.gameType);
        System.out.println(wow.gameType);
        swapp3(ageOfEmpires, wow);
        System.out.println(ageOfEmpires.gameType);
        System.out.println(wow.gameType);

    }
    static void swapp1(Game ref1,Game ref2){
        
        System.out.println(ref1.gameType);
        System.out.println(ref2.gameType);
        Game temp = ref1; //temp is referene var which stored hexa code of ref1 no new object is made 
        ref1 = ref2;// no reflection will be made as we are swapping ref code locally
        ref2 = temp;
        System.out.println(ref1.gameType);
        System.out.println(ref2.gameType);
    }
    static void swapp2(Game ref1,Game ref2){
        
        // approach making of 3 objects in heap
        Game temp = new Game(null);// null is only for reference variable enum gametype is reference variable
        temp.gameType = ref1.gameType;
        ref1.gameType = ref2.gameType;
        ref2.gameType = temp.gameType;

    }
    static void swapp3(Game ref1,Game ref2){
        
        // approach : making of local Gametype to store game type of object  
       
        GameType temp = ref1.gameType;//value of ref1 is Gametype.Str
        ref1.gameType = ref2.gameType;
        ref2.gameType = temp;

    }

    public static void swap(int integer1, int integer2) {
        // System.out.println("before");
        // System.out.println(a);
        // System.out.println(b);

        int temp = integer1;
        integer1 = integer2;
        integer2 = temp;
        // System.out.println("after");
        // System.out.println(a);
        // System.out.println(b);

    }

    public static void swap(Game game1, Game game2) {

        // Game temp = game1; now temp is also pointing to obj1
        // game1 = game2; game1 is pointing to obj2
        // game2 = temp; game2 is pointing to obj1

        // here just reference code is changes so pointing is changed
        // no obj1 (gametype), obj2 is changed in heap
        // if print locally they print thier respected pointed object

        // reflect is only made universally if heap obj is changed
        // if in heap oj is changed so whoever pointing to obj will have updated heap
        // obj
        // so to swap we have to change obj by accesing obj not by changing refernece
        // code

       // Game temp = game1;// now temp has refernece code of game1 given by ageOfEmpires so all this are
                          // pointing to obj1
        //game1.gameType = game2.gameType;// now we have accessed obj1 ie STRATEGY and changed to RGP
        //game2.gameType = temp.gameType;// here we have accessed obj2 ie RGP and changed to RGP as temp is also RGP as obj1 is changed due to above line


        // so above will not work as in 3 variable approch we need to create 3 object above was two object 
        // below i created new obj of temp to store value that need to be swapped
        
        /* 
        
        Game temp2 = new Game(null);//now temp has ref code of new object in heap for storing why null bec of constructor u have to give some value
        temp2.gameType = game1.gameType;//now we accessed obj3(new obj of temp) ie null and changed it to STRATEGY
        game1.gameType = game2.gameType;// now we have accessed obj1 ie STRATEGY and changed to RGP now obj1 is RGP
        game2.gameType = temp2.gameType;// here we have accessed obj2 ie RGP and using obj3 changed it to STRATEGY 
        
        */

        //why to create new obj in heap instead we can make simple stroage of game type

        GameType temp3 = game1.gameType;// gametype STRATEGY is stroed in temp3

        game1.gameType = game2.gameType;// now we have accessed obj1 ie STRATEGY and changed to RGP
        game2.gameType = temp3;// here we have accessed obj2 ie RGP and using gametype temp storage changed to STRATEGY

// here references code of game1 and game2 are not swapped
        // here we just accesed obj using this reference code to change actual object in
        // heap

        // if obj is private you can access private obj by using getter funcation and
        // then change

    }

}


 /*
  GPT

public static void swap(Game game1, Game game2) {

    // Attempting to swap references directly:
    // Game temp = game1;       // Now `temp` also points to the object that `game1` references
    // game1 = game2;           // `game1` now points to the object that `game2` references
    // game2 = temp;            // `game2` now points to the object that `temp` references

    // This only changes the references within this method; the original objects remain unchanged in the heap.
    // Printing locally would show the swapped references, but it would not affect the objects outside this method.

    // Changes are only universally reflected if we modify the actual object in the heap.
    // To truly swap, we need to access and modify the object’s fields, not just the references.

    // Example:
    // Game temp = game1;                // `temp` now holds the reference code of `game1` (ageOfEmpires), so all point to obj1
    // game1.gameType = game2.gameType;  // Access obj1 (STRATEGY) and change it to RPG
    // game2.gameType = temp.gameType;   // Access obj2 (RPG) and change it to STRATEGY as `temp` still refers to STRATEGY

    // The above does not work as expected in a true "swap" because it only involves two objects.
    // To implement a 3-variable swap, we need a third object to temporarily store values for swapping.
    
    
    Game temp2 = new Game(null);            // Creating a new object `temp2` in the heap; null is used initially because the constructor requires a value
    temp2.gameType = game1.gameType;        // `temp2` (obj3) now temporarily holds STRATEGY
    game1.gameType = game2.gameType;        // `game1` (obj1) now holds RPG, effectively changing obj1 to RPG
    game2.gameType = temp2.gameType;        // `game2` (obj2) now holds STRATEGY as copied from obj3
    

    // Instead of creating a new object, we can simplify by using a temporary storage variable of type GameType:
    
    GameType temp3 = game1.gameType;         // Temporarily store STRATEGY in `temp3`
    game1.gameType = game2.gameType;         // Change obj1 to RPG
    game2.gameType = temp3;                  // Change obj2 to STRATEGY using `temp3`'s stored value

    // Note: Here, the references of `game1` and `game2` themselves are not swapped.
    // Instead, we accessed the objects they point to and modified the actual data in the heap.

    // If `gameType` were private, you could use getter and setter methods to access and modify it.
}









  */

 