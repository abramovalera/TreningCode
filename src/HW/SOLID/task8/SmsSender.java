package HW.SOLID.task8;

public class SmsSender implements Massage {
    @Override
    public void send(String massage) {
        System.out.println("Отправка SMS: " + massage);
    }
}
