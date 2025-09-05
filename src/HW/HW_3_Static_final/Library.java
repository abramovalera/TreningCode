package HW.HW_3_Static_final;

public class Library {
    public String category;
    protected String author;
    private String bookTitle;
    int year;

    public String getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYear() {
        return year;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
