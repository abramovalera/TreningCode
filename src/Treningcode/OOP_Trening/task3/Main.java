package Treningcode.OOP_Trening.task3;

//Создай классы Book и Library.
// Книга содержит название, автора и количество страниц.
// Библиотека хранит список книг и умеет их выводить
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Книга 1", "Автор 1", 232);
        Book book2 = new Book("Книга 1", "Автор 1", 232);
        Book book3 = new Book("Книга 3", "Автор 1", 232);
        Book book4 = new Book("Книга 4", "Автор 1", 232);
        Library myLibrary = new Library();

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.printAllBook();
        System.out.println(book1.equals(book2));

        myLibrary.removeBook(book4);


    }
}
