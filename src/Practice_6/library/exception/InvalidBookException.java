package Practice_6.library.exception;

//непроверяемый
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String messege) {
        super(messege);
    }
}
