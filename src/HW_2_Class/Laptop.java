package HW_2_Class;

public class Laptop {
    String brand;
    double price;

    public Laptop(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printInfo(){
        System.out.println("Бренд ноутбука: " + brand);
        System.out.println("Цена: " + price + "  руб.");
    }

}
