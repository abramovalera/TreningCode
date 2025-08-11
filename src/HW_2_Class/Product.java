package HW_2_Class;

public class Product {
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public void applyDiscount(double discount){
        price = price - discount;
    }
    public void printInfo(){
        System.out.println("Название товара: " + name);
        System.out.println("Цена: " + price);

    }
}
