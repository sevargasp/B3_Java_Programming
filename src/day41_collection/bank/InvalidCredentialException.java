package day41_collection.bank;
// Any class which is child class of Exception is checked/compile exception [except RunTimeException]
// Any class which is child class of RunTimeException is unchecked/runtime Exception

public class InvalidCredentialException extends Exception {

    public InvalidCredentialException (String message) {
        super(message);
    }
}
//to convert in a exception class, I have to extend from ExceptionClass
