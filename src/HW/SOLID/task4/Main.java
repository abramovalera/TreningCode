package HW.SOLID.task4;

public class Main {
    public static void main(String[] args) {
        ProcessOrder processOrder = new ProcessOrder();
        GenerateInvoice generateInvoice = new GenerateInvoice();
        SendEmail sendEmail = new SendEmail();

        processOrder.processOrder();
        generateInvoice.generateInvoice();
        sendEmail.sendEmailConfirmation();
    }
}
