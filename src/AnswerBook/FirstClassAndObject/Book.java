package AnswerBook.FirstClassAndObject;

public class Book {
    public static void main(String[] args) {
        Book book1 = new Book("Маша и медведь", "Пушник");
        book1.printInfo();
    }
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void printInfo(){
        System.out.println("Название: " + title + ", " + "Автор: " + author);
    }
}


