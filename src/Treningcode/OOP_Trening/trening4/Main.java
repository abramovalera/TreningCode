package Treningcode.OOP_Trening.trening4;

/**
 * Меню
 * Баургер Напиток
 * если холодный скидка 10
 * если веганское блюдо скидка 20
 */
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Item burger = new Burger("Бургер", 100, false);
        Item latte = new Drink("Латте", 100, true);

        menu.addItem(burger);
        menu.addItem(latte);

        menu.printFullMenu();
    }
}
