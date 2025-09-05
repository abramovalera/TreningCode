package AnswerBook.FirstClassAndObject;

public class Laptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("lenovo", 16);
        System.out.println(laptop1.specs());
    }

    String brand;
    int ram;

    public Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public String specs() {
        return "Ноутбук " + brand + " с " + ram + "ГБ памяти";
    }
}
