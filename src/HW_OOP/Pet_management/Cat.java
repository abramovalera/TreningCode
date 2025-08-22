package HW_OOP.Pet_management;

public class Cat extends Pet {
    @Override
    public void action() {
        System.out.println("Играет");
    }

    @Override
    public void eat() {
        System.out.println("Влажный корм");
    }
}
