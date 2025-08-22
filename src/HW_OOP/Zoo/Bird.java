package HW_OOP.Zoo;

public class Bird extends Animal {

    @Override
    public void makeMove() {
        System.out.println("Летает");
    }

    @Override
    public void makeSound() {
        System.out.println("Чирикает");
    }
}
