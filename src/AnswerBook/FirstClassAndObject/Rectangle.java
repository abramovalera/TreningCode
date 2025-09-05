package AnswerBook.FirstClassAndObject;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle ob1 = new Rectangle(10, 10);
        System.out.println(ob1.getArea());
        System.out.println(ob1.isSquare());
    }

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public boolean isSquare() {
        return width == height; //если равно true, иначе false
    }
}
