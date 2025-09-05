package HW.HW_OOP.Farm;

public class Chicken implements FarmAnimal {

    @Override
    public void feed() {
        System.out.println("Питается зерном");
    }

    @Override
    public void care() {
        System.out.println("Большая клетка");
    }

    @Override
    public void produce() {
        System.out.println("Несет яйца");
    }
}
