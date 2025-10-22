package AnswerBook.FirstClassAndObject;

public class WeatherForecast {
    public static void main(String[] args) {
        WeatherForecast t1 = new WeatherForecast();
        t1.printForecast();
    }
    int temperature = 4;

    public boolean isCold() {
        return temperature < 5;
    }

    public void printForecast() {
        System.out.println(isCold());
    }
}
