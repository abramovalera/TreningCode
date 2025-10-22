package Treningcode.OOP_Trening.trening2;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {

    List<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void printInfoTicket() {
        for (Ticket ticket : tickets) {
            ticket.printInfo(); // каждый билет сам знает, как себя показать
        }
    }
}
