package Treningcode.OOP_Trening.trening2;

public class ConcertTicket extends Ticket{
    public ConcertTicket(int idTicket, double priseTicket, int age) {
        super(idTicket, priseTicket, age);
    }

    @Override
    public double finalPrise() {
        if (getAge() > 12) {
            return getPriseTicket() * 0.7;
        }
        return getPriseTicket();
    }

    @Override
    public void printInfo() {
        System.out.println("Билет в кино");
        System.out.println("ID: " + getIdTicket());
        System.out.println("Базовая цена: " + getPriseTicket());
        System.out.println("Возраст: " + getAge());
        System.out.println("Итоговая цена: " + finalPrise());
        System.out.println("--------------------");
    }
}
