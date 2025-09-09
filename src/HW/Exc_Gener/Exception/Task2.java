package HW.Exc_Gener.Exception;

public class Task2 {
    public static void main(String[] args) {

        try {
            division(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль! ");
        }
    }

    static int division(int a, int b) {
        return a / b;

    }
}
