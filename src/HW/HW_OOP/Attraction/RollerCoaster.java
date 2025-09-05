package HW.HW_OOP.Attraction;

public class RollerCoaster implements  Attraction{
    @Override
    public void info() {
        System.out.println("Американские горки ");
    }

    @Override
    public void maintain() {
        System.out.println("Проверка перед заездом");
    }
}
