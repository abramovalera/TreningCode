package Treningcode.OOP_Trening.trening3_no;

public class Product extends Item {
    public Product(String productName, double productPrise) {
        super(productName, productPrise);
    }

    @Override
    public double getVat() {
        return 0;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

}
