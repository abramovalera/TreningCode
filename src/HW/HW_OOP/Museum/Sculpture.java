package HW.HW_OOP.Museum;

public class Sculpture implements Exhibit {
    @Override
    public void describe() {
        System.out.println("Из мрамора");
    }

    @Override
    public void presrve() {
        System.out.println("Требуется реставрация и чистка ");
    }
}
