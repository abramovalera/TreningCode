package HW.SOLID.task8;

public class EmailSender implements Massage {

    @Override
    public void send(String massage) {
        System.out.println("Отправка email: " + massage);
    }
}


