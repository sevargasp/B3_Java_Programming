package day41_collection.bank;
// Any class which is child class of Exception is checked/compile exception [except RunTimeException]
// Any class which is child class of RunTimeException is unchecked/runtime Exception

public class NotEnoughBalanceException extends RuntimeException {

    // This is unchecked exception because it extends RunTimeException Class


    public NotEnoughBalanceException(String message) {
        super(message);
    }
}