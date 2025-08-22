package HW_OOP.Pet_management;

public class Main {
    public static void main(String[] args) {
        Manager oleg = new Manager();

        Cat busa = new Cat();
        oleg.setPet(busa);
        oleg.action();
        oleg.eat();

        Dog recs = new Dog();
        oleg.setPet(recs);
        oleg.action();
        oleg.eat();
    }
}
