package AnswerBook.FirstClassAndObject;

public class ShopItem {
    public static void main(String[] args) {
        ShopItem glasses = new ShopItem(100, 10);
        System.out.println(glasses.getFinalPrice());

        ShopItem glasses2 = new ShopItem(100, 50);
        System.out.println(glasses2.getFinalPrice());
    }

    private double price;
    private int discount;

    public ShopItem(double price, int discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getFinalPrice() {
        return price * (100 - discount) / 100.0;
    }
}
