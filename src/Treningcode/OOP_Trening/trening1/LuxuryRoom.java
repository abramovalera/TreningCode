package Treningcode.OOP_Trening.trening1;

public class LuxuryRoom extends Room{
    public LuxuryRoom(int id, double prise, boolean book) {
        super(id, prise, book);
    }

    @Override
    public String getType() {
        return "Люкс";
    }
}
