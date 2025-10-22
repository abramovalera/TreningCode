package AnswerBook.FirstClassAndObject;

public class Email {
    public static void main(String[] args) {
        Email t1 = new Email("Вани", "Долг за шаурму!", "Маше");
        t1.send();
    }

    String sender, receive, subject;

    public Email(String sender, String subject, String receive) {
        this.sender = sender;
        this.receive = receive;
        this.subject = subject;
    }

    public void send() {
        System.out.println("Письмо от " + sender + " к " + receive + " с темой " + subject + " отправлено");
    }
}
