package HW_OOP.Attraction;

public class Corusel implements Attraction{

    @Override
    public void info() {
        System.out.println("Карусель");
    }

    @Override
    public void maintain() {
        System.out.println("ТО механизмов");
    }
}
