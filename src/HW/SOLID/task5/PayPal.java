package HW.SOLID.task5;

public class PayPal implements  Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
