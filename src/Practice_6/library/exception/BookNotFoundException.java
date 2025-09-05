package Practice_6.library.exception;

public class BookNotFoundException extends Exception{
    public BookNotFoundException (String massage){
        super(massage);
    }
}
