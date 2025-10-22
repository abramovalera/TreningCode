package Treningcode.OOP_Trening.trening4;

public abstract class Item {

    private String nameItem;
    private int priseItem;

    public Item(String nameItem, int priseItem) {
        this.nameItem = nameItem;
        this.priseItem = priseItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public int getPriseItem() {
        return priseItem;
    }

    public abstract void printInfo();
}
