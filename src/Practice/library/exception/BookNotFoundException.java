package Practice.library.exception;

public class BookNotFoundException extends Exception{
    public BookNotFoundException (String massage){
        super(massage);
    }
}
