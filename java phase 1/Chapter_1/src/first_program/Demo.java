package first_program;
//PS C:\code\prog_lang\java\java phase 1\Chapter_1> javac -d . src/first_program/Demo.java 
// in CLI do -d and give command line arguments as type "java class_name hello aniket" print funcation print aniket will do  we do 

/*
PS C:\code\prog_lang\java\java phase 1\Chapter_1> java -cp .  first_program.Hello hello aniket
aniket
 */
// as class is private java file name can be anything 
class Hello{
    public static void main(String args[]){
        System.out.println(args[1]);
    }
}