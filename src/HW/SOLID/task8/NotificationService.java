package HW.SOLID.task8;

/*
Задача: Используйте интерфейсы и внедрение зависимостей, чтобы ослабить связь между классами.
 */
public class NotificationService {
    private final Massage massageSend;

    public NotificationService(Massage massage) {
        this.massageSend = massage;
    }

    public void sendNotification(String massage){
        massageSend.send(massage);
    }
}


