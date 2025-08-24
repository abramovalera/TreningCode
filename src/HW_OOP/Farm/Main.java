package HW_OOP.Farm;

public class Main {
    public static void main(String[] args) {
        FarmAnimal cow1 = new Cow();
        Farm cowFarm = new Farm(cow1);
        cowFarm.manageAnimal();

        FarmAnimal chicken1 = new Chicken();
        Farm chickenFarm = new Farm(chicken1);
        chickenFarm.manageAnimal();
    }
}
