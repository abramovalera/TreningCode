package AnswerBook.FirstClassAndObject;

public class Movie {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Terminator", 1996);
        movie1.describe();
    }

    String name;
    int year;

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void describe() {
        System.out.println("Фильм: " + getName() + " вышел в " + getYear() + " году");
    }
}
