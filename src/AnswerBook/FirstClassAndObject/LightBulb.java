package AnswerBook.FirstClassAndObject;

public class LightBulb {
    public static void main(String[] args) {
        LightBulb t1 = new LightBulb();
        t1.printState();
        t1.switchState();
        t1.printState();

    }

    private boolean isOn;

    public void switchState() {
        isOn = !isOn;
    }

    public void printState() {
        System.out.println("Лампочка: " + isOn);
    }
}
