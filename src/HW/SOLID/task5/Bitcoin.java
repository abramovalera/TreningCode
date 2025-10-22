package HW.SOLID.task5;

public class Bitcoin implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
