package HW_OOP.Restoran;

public class Menu {
    Dish dish;

    void setDish(Dish dish) {
        this.dish = dish;
    }

    void printMenu() {
        System.out.println("Сегодня в меню: " + dish.getDescription());
    }
}