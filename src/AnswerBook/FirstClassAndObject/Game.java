package AnswerBook.FirstClassAndObject;

public class Game {
    public static void main(String[] args) {
        Game t1 = new Game("Файты", "Мортл - Комбат");
        t1.start();
    }

    String title, genre;

    public Game(String genre, String title) {
        this.genre = genre;
        this.title = title;
    }

    public void start() {
        System.out.println("Запуск игры " + title + " в жанре " + genre);
    }
}
