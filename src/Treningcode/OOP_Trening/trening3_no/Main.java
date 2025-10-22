package Treningcode.OOP_Trening.trening3_no;

/**
 *  онлайн магазин может быть добавлен 1 товар
 *  общее: цена
 *  электронны ндс 20%  скидка 0
 *  цифровой ндс 0% скидка 15%
 *  продуктовый едс 10 скидка 5%
 *  итоговая стоимость в зависимости о категории
 *  корзина выводит инфо с учетом налогов и скидок
 */
public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        Item itemE1 = new Electronic("Iphone10", 100);
        Item itemP1 = new Product("Яблоко", 60);

        basket.addItem(itemE1);
        basket.addItem(itemP1);
        basket.printInfo();
    }
}
