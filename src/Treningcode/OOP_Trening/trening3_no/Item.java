package Treningcode.OOP_Trening.trening3_no;

public abstract class Item {
    private final String name;       // название товара
    private final double price;      // базовая цена без НДС и скидок

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Каждый товар указывает свою ставку НДС и скидку
    public abstract double getVat();      // ставка НДС (0.20 = 20%)
    public abstract double getDiscount(); // ставка скидки (0.15 = 15%)
}
