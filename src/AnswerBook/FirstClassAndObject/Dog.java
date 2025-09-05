package AnswerBook.FirstClassAndObject;

public class Dog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobi", "Bool Dogi Dog");
        dog1.bark();
    }

    public Dog(String name, String bread) {
        this.name = name;
        this.bread = bread;
    }

    String name;
    String bread;

    public void bark() {
        System.out.println("Собака " + name + " породы " + bread);
    }
}

