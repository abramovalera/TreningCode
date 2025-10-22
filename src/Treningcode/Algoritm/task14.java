package Treningcode.Algoritm;
//Написать метод деления с обработкой исключения деления на ноль

public class task14 {
    public static void main(String[] args) {
        method(1, 0);
    }

    public static int method(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

}

