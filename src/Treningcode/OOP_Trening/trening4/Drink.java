package Treningcode.OOP_Trening.trening4;

public class Drink extends Item {
    private boolean cold;
    public Drink(String nameItem, int priseItem, boolean cold) {
        super(nameItem, priseItem);
        this.cold = cold;
    }

    @Override
    public void printInfo() {
        int finalPrise = 0;
        finalPrise = (int) (getPriseItem() * 0.9);
        if (cold) {
            System.out.println(getNameItem() + getPriseItem());
            System.out.println("_____________");
        } else {
            System.out.println(getNameItem() + finalPrise);
            System.out.println("_____________");
        }


    }
}
