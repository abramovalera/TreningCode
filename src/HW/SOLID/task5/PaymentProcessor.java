package HW.SOLID.task5;
/*
Задача: Избавьтесь от if-else, применив полиморфизм (наследование или интерфейсы).
 */

public class PaymentProcessor {
    public void paymentProcessor(Payment payment, double amount){
        payment.pay(amount);

    }
}
