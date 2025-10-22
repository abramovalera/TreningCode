package Treningcode.OOP_Trening.task3;


import java.util.ArrayList;
import java.util.List;

public class Library  {


    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (!books.contains(book)){
            throw  new RuntimeException("Нету такой книги");
        }
        books.add(book);
    }



    public void removeBook(Book book) {
        books.remove(book);
    }

    public void printAllBook() {
        for (Book book : books) {
            System.out.println(book.getNameBook()+ ", " + book.getAuthor()+ ", " + book.getCountPage() + " стр");
        }
    }


}
