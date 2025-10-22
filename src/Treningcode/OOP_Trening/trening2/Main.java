package Treningcode.OOP_Trening.trening2;

/**
 * В системе может быть добавлен один билет: на киносеанс, поезд или концерт.
 * Каждый билет содержит цену и место, но по-разному рассчитывает итоговую стоимость с учётом возраста покупателя:
 * Кино: скидка 50% детям до 12 лет
 * поезд: скидка 30% пенсионерам от 65 лет
 * Концерт: скидок нет
 * Нужно создать систему, которая добавляет билет,
 * рассчитывает его стоимость и отображает информацию о нём с учётом особенностей.
 */
public class Main {
    public static void main(String[] args) {
        TicketOffice ticketOffice = new TicketOffice();
        Ticket ticketMove1 = new MovieTicket(1, 150, 10);
        Ticket ticketMove2 = new MovieTicket(2, 105, 13);
        Ticket ConcertTrain1 = new ConcertTicket(1,200, 65);
        Ticket ConcertTrain2 = new ConcertTicket(2,200, 77);

        ticketOffice.addTicket(ticketMove1);
        ticketOffice.addTicket(ticketMove2);
        ticketOffice.addTicket(ConcertTrain1);
        ticketOffice.addTicket(ConcertTrain2);

        ticketOffice.printInfoTicket();



    }
}
