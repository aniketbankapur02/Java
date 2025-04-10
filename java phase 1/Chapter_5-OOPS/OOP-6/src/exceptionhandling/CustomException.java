package exceptionhandling;

public class CustomException extends Exception {
    CustomException(String message){// for printing this string message printing throw new Exception("Message : just for learning"); 
        super(message);// super will call parent constructor that parent constructor will print message
    }
}
// using this custom in Example5.java
