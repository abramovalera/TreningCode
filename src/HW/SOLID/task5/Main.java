package HW.SOLID.task5;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        Bitcoin bitcoin = new Bitcoin();
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();

        paymentProcessor.paymentProcessor(bitcoin, 100);
        paymentProcessor.paymentProcessor(creditCard, 120);
        paymentProcessor.paymentProcessor(payPal, 150);
    }
}
