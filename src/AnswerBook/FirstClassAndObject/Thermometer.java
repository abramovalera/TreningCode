package AnswerBook.FirstClassAndObject;

public class Thermometer {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer(37.4);
        thermometer.display();
        System.out.println(thermometer.isFever());

        Thermometer thermometer1 = new Thermometer(37.6);
        thermometer1.display();
        System.out.println(thermometer1.isFever());
    }

    double currentTemp;

    public Thermometer(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    public boolean isFever() {
        return currentTemp > 37.5;
    }

    public void display() {
        System.out.println("Температура: " + currentTemp + " °C");
    }
}
