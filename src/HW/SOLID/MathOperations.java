package HW.SOLID;

/**
 * Задача: Устраните дублирование кода, применив перегрузку методов или использование массива аргументов.
 */

public class  MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.add(1,1));
        System.out.println(mathOperations.add(1,1,1));
        System.out.println(mathOperations.add(1,1,1,1));
    }
}
