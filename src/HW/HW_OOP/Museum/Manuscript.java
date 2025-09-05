package HW.HW_OOP.Museum;

public class Manuscript implements Exhibit {
    @Override
    public void describe() {
        System.out.println("Старый текст");
    }

    @Override
    public void presrve() {
        System.out.println("Контролируемая влажность и температура");
    }
}
