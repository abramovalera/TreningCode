package AnswerBook.FirstClassAndObject;

public class Cat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka", 4);
        cat1.moew();
        cat1.sleep();
    }

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void moew() {
        System.out.println("Кошка " + name + " мяукает");
    }

    public void sleep() {
        System.out.println("Кошка " + name + " спит");
    }
}
