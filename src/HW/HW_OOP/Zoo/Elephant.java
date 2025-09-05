package HW.HW_OOP.Zoo;

public class Elephant extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Гудит бууууу");
    }

    @Override
    public void makeMove() {
        System.out.println("Медленно топает");
    }
}
