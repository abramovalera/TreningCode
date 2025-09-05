package AnswerBook.FirstClassAndObject;

public class TV {
    public static void main(String[] args) {
        TV tv = new TV("Honor ", false);
        tv.printState();

        tv.togglePower();
        tv.printState();

        tv.togglePower();
        tv.printState();
    }

    String brand;
    boolean isOn;

    public TV(String brand, boolean isOn) {
        this.brand = brand;
        this.isOn = isOn;
    }

    public void togglePower() {
        isOn = !isOn;
    }

    public void printState() {
        if (isOn) {
            System.out.println("Телевизор " + brand + "Сейчас включен ");
        } else {
            System.out.println("Телевизор " + brand + "Сейчас выключен ");
        }
    }

}
