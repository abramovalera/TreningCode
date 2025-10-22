package Treningcode.OOP_Trening.task2;

/**
 *Создай классы Student и Group.
 * Student содержит имя и оценки.
 * Group хранит список студентов и считает средний балл.
 */
public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product product1 = new Product("Вафля", 100);
        Product product2 = new Product("Вафля", 100);
        Product product3 = new Product("Молоко", 150);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.printPriseProduct();
        store.allPriceProduct();


    }

}
