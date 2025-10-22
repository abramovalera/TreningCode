package Treningcode.OOP_Trening.trening2;

public abstract class Ticket {

  private int idTicket;
  private double priseTicket;
  private int age;

    public Ticket(int idTicket, double priseTicket, int age) {
        this.idTicket = idTicket;
        this.priseTicket = priseTicket;
        this.age = age;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public double getPriseTicket() {
        return priseTicket;
    }

    public int getAge() {
        return age;
    }

    public abstract double finalPrise();
    public abstract void printInfo();

}
