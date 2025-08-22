package HW_OOP.BatanicGarden;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
    public void maintainPlant(){
        plant.care();
    }
}
