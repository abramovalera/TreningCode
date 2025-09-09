package Practice.library.exception;

//непроверяемый
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String messege) {
        super(messege);
    }
}
