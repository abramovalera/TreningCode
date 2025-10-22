package AnswerBook.Cycles;

public class task10 {
    public static void main(String[] args) {
        method(10);
    }

    public static void method(int number) {
        int result = 0;

        for (int i = 1; i <= 10; i++) { // цикл от 1 до 10
            result += number;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
}
