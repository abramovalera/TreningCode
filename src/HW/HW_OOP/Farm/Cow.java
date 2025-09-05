package HW.HW_OOP.Farm;

public class Cow implements FarmAnimal {

    @Override
    public void feed() {
        System.out.println("Питается: Сухая трава");
    }

    @Override
    public void care() {
        System.out.println("Нужен выпос");
    }

    @Override
    public void produce() {
        System.out.println("Дает молоко");
    }
}
