package Treningcode.OOP_Trening.trening1;

public abstract class Room {

    private int roomId;
    private double prise;
    private boolean book;

    public Room(int id, double prise, boolean book) {
        this.roomId = id;
        this.prise = prise;
        this.book = book;
    }

    public int getId() {
        return roomId;
    }

    public double getPrise() {
        return prise;
    }

    public boolean isBooked() {  // геттер для проверки статуса
        return book;
    }


    public void bookingRoom() {
        if (!book) {
            book = true;
        } else {
            System.out.println("Эта комната занята!");
        }
    }

    public void releaseRoom() {
        if (book) {
            book = false;
        } else {
            System.out.println("Эта комната свободна!");
        }
    }
    public abstract String getType();
}
