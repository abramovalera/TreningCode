package HW.HW_2_Class;

public class Book {
    String title;
    String author;

    public  Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    void setTitle(String NewTitle){
        this.title = NewTitle;
    }
    void  setAuthor(String NewAuthor){
        this.author = NewAuthor;
    }
    void printInfoBook(){
        System.out.println(this.title + this.author);
    }
}

