package Treningcode.OOP_Trening.trening4;

public class Burger extends Item {
    private boolean vegan; //false

    public Burger(String nameItem, int priseItem, boolean vegan) {
        super(nameItem, priseItem);
        this.vegan = vegan;
    }

    @Override
    public void printInfo() {
        int finalPrise = 0;
        finalPrise = (int) (getPriseItem() * 0.8);
        if (vegan) {
            System.out.println(getNameItem() + finalPrise);
            System.out.println("_____________");
        } else {
            System.out.println(getNameItem() + getPriseItem());
            System.out.println("_____________");
        }
    }
}
