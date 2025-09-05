package HW.HW_OOP.BatanicGarden;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden greenGarden = new BotanicalGarden();

        Plant orhid1 = new Orchid();
        greenGarden.setPlant(orhid1);
        greenGarden.maintainPlant();

        Plant cactus1 = new Cactus();
        greenGarden.setPlant(cactus1);
        greenGarden.maintainPlant();

    }
}
