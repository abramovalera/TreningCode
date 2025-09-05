package HW.HW_OOP.Restoran;

public class HotDish implements Dish {
    String name;
    int temperature;

    HotDish(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public String getDescription() {
        return name + " Температура " + temperature;
    }
}
