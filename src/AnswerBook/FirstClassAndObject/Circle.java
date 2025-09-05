package AnswerBook.FirstClassAndObject;

public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(10.5);
        System.out.println(circle.getArea());
    }

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

