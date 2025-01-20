package call_by_value_of_reference;

// C:\code\prog_lang\Vscode_workspace\project_1> 
// javac call_by_value_of_reference/code2.java

// we have made package so while giving to JVM give class in package format
//package_name.class_name
// java call_by_value_of_reference.code2

// if package made mentsion class with package 
//example of game without using enum
class Game {
    int gameType;

    // Constructor
    public Game(int gameType) {
        this.gameType = gameType;
    }

    // Getter for gameType
    public int getGameType() {
        return gameType;
    }

    // Setter for gameType (optional)
    public void setGameType(int gameType) {
        this.gameType = gameType;
    }
}



public class code4

{
    public static void main(String[] args) {


        Game ageOfEmpires = new Game(100);
        Game wow = new Game(200);

        System.out.println(ageOfEmpires.gameType);
        System.out.println(wow.gameType);
        swap(ageOfEmpires, wow);
        System.out.println(ageOfEmpires.gameType);
        System.out.println(wow.gameType);

    }


    public static void swap(Game game1, Game game2) {


        int temp3 = game1.gameType;// gametype 100 is stroed in temp3

        game1.gameType = game2.gameType;// now we have accessed obj1 ie 100 and changed to 200
        game2.gameType = temp3;// here we have accessed obj2 ie 200 and using gametype temp storage changed to 100

// here references code of game1 and game2 are not swapped
        // here we just accesed obj using this reference code to change actual object in
        // heap

        // if obj is private you can access private obj by using getter funcation and
        // then change

    }

}




 
