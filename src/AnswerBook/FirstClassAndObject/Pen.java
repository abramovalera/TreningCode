package AnswerBook.FirstClassAndObject;

public class Pen {
    // Объявил переменную
    String color;
    // Создал конструктор
    public Pen(String color) {
        this.color = color;
    }

    public void write(String text) {
        System.out.println(color + "ручка пишет: " + text);
    }

    public static void main(String[] args) {
      Pen penWhite = new Pen("Белая ");
      penWhite.write("Hello! ");
    }
}
