package HW.HW_OOP.Pet_management;

public class Dog extends Pet {
    @Override
    public void action() {
        System.out.println("Гуляет");
    }

    @Override
    public void eat() {
        System.out.println("Сухой корм");
    }
}
