package Treningcode.OOP_Trening.task3;

import java.util.Objects;

public class Book{
    private String nameBook, author;
    private int countPage;

    public Book(String nameBook, String author, int countPage) {
        this.nameBook = nameBook;
        this.author = author;
        this.countPage = countPage;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getCountPage() {
        return countPage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return countPage == book.countPage && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, countPage);
    }
}
