// due to package concept same greeting can be made by differnet package name

package classwork.packageclasswork.c;

public class Greeting {
    public static void main(String[] args) {
        Message.greet();
        Message.greetPrimum();
        // primium is package private thats why we can access it 
        // and note within package there is no need to import
    }
}
