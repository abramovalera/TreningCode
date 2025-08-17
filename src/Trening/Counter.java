package Trening;

public class Counter {
    // Константа курса — сколько долларов за 1 рубль
    static final double USD_RATE = 1.0 / 95;

    // Статический метод конвертации
    public static double convert(double rub) {
        return rub * USD_RATE;
    }

}
