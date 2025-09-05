package Practice.practice_1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сумма: " + MathOperations.add(10,5));
        System.out.println("Разница: " + MathOperations.subtract(10,6));
        System.out.println("Произведение: " + MathOperations.multiply(10,5));
        System.out.println("Деление: " + MathOperations.divide(10,3));
        System.out.println("Максимальное число: " + MathOperations.findMax(45,546345));
        System.out.println("Разница межу числами:  " + MathOperations.difference(10,-5));
        System.out.println("Площадь:  " + MathOperations.squareArea(10));
        System.out.println("Периметр:  " + MathOperations.squarePerimeter(5));
        System.out.println("Минуты: " + MathOperations.convertSecondToMinutes(221));
        System.out.println("AVG SPEED: " + MathOperations.averageSpeed(46.43,56.21));
        System.out.println("Гипотенуза: " +  MathOperations.findHypotenuse(2, 5));
        System.out.println("Динна окружности (2πr): " + MathOperations.circleCircumference(10));
        System.out.println("Какой процент?: " + MathOperations.calculateParcentage(200,25));
        System.out.println("Перевод в Фаренгейты: " + String.format("%.2f", MathOperations.celsiusToFahrenheit(5.4)));
        System.out.println("Перевод в Целсий: " + String.format("%.2f", MathOperations.fahrenheitToCelsius(50.3)));

    }
}
