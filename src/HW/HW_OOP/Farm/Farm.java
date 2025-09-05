package HW.HW_OOP.Farm;

public class Farm {
    private FarmAnimal animal; // храним в этой переменной животное - инкапсуляция

    public Farm(FarmAnimal NewAnimal) {
        this.animal = NewAnimal;
    }
    public void manageAnimal(){
        animal.feed();
        animal.care();
        animal.produce();
    }
}
