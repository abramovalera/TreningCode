package HW_Conditional_Operators.do_while;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        positiveNumbers();
    }

    public static void positiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 1);
        System.out.println("Готово! Запускаю!");
    }
}
