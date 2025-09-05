package HW.HW_OOP.Pet_management;

public class Manager {

    private Pet pet;

    public void setPet(Pet newPet){ // устанавливает текущего питомца
        this.pet = newPet; // сохраняем выбранного питомца
    }
    public void action(){
        this.pet.action();
    }
    public void eat(){
        this.pet.eat();
    }
}
