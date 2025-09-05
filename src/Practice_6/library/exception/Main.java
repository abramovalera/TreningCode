package Practice_6.library.exception;

import Practice_6.library.Book;
import Practice_6.library.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1994", "Пушкин"));
        //  library.addBook(new Book("1994", "Пушкин"));
        library.addBook(new Book("1991", "Онегин"));
        library.addBook(new Book("Онегин", "Пушкин"));

        try {
            library.findBook("323");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение! ");
        }

    }
}
