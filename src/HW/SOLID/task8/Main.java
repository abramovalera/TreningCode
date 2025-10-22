package HW.SOLID.task8;

public class Main {
    public static void main(String[] args) {


        Massage massageEmail = new EmailSender();
        NotificationService emailService = new NotificationService(massageEmail);
        emailService.sendNotification("Уведомление на почте!");

        Massage massageSms = new SmsSender();
        NotificationService smsService = new NotificationService(massageSms);
        smsService.sendNotification("Пополни баланс!");
    }
}
