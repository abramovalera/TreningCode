package Treningcode.OOP_Trening.task1;

public class SwiftTransfer implements Transfer {
    @Override
    public void transfer(Client a, Client b, double amount) {
        System.out.println("Swift перевод: " + amount + "от клиента " + a.getId() + "клиенту " + b.getId());
    }
}
