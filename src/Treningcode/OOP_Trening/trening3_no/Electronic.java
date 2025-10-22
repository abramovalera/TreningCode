package Treningcode.OOP_Trening.trening3_no;

public class Electronic extends Item {
    public Electronic(String productName, double productPrise) {
        super(productName, productPrise);
    }


    @Override
    public double getVat() {
        return 0.20;
    }

    @Override
    public double getDiscount() {
        return 0.0;
    }
}
