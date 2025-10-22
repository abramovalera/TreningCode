package Treningcode.OOP_Trening.trening1;

public class StandardRoom extends Room{
    public StandardRoom(int id, double prise, boolean book) {
        super(id, prise, book);
    }

    @Override
    public String getType() {
        return "Стандарт";
    }
}
