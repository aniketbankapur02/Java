package shreyanshclasswork;

public class U1ClassWork1 {
    static int counter = 1;

    static int add(int a,int b){
        return a  + b;
    }

    // this method cannot be static as it uses static field (field of class)
    // as counter  should be control by objects only via obj.methodCalls only not via suspisous calls like CLassName.sub this static method can change counter of objects which is bad counter should be changed by objects method calls only  so that counter is cotrolled by object only 
    static int sub(int a,int b){
        counter++;
        return a  + b;
    }
 public static int main(String[] args) { // error bec of int 
    Math.sqrt(counter);

    return 0;
 }   
}
