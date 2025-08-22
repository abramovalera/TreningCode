package HW_OOP.Zoo;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal){
        this.animal = animal;
        System.out.println("Добавлено животное: " + animal);
    }
    public void showMakeSound(){
        this.animal.makeSound();
    }
    public  void showMakeMove(){
        this.animal.makeMove();
    }
}
