package HW.HW_OOP.Aquarium;

public class Main {
    public static void main(String[] args) {

        // Создаём объекты морских существ
        Aquarium sharkBigWhite = new Shark();
        Aquarium fishMili = new Fish();
        Aquarium octopusBobo = new Octopus();

        // Демонстрируем поведение каждого существа
        showBehavior(sharkBigWhite);
        showBehavior(fishMili);
        showBehavior(octopusBobo);

    } //Метод для демонстрации поведения любого морского существа
    public static void showBehavior(Aquarium creature){
        creature.move();
    }
}
