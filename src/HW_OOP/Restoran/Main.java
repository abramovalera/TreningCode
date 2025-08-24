package HW_OOP.Restoran;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.setDish(new HotDish("Борщ", 75));
        menu.printMenu();

        menu.setDish(new Drink("Чай", 300));
        menu.printMenu();
    }
}

