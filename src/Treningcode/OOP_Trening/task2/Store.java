package Treningcode.OOP_Trening.task2;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        if (!products.contains(product)) {
            throw new RuntimeException("Нет такого продукта ");
        }
        products.remove(product);
    }

    public void printPriseProduct() {
        for (Product i : products)
            System.out.println(i.getNameProduct() + ", " + i.getPrice());
    }

    public void allPriceProduct(){
        int sum = 0;
        for (Product i : products)
            sum = sum + i.getPrice();
        System.out.println(sum);
    }


}
