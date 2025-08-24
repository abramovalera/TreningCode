package HW_OOP.Restoran;

public class Drink implements Dish {
    String name;
    int volume;

    public Drink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String getDescription() {
        return name + " Объем " + volume;
    }
}

