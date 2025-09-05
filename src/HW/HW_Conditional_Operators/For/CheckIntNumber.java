package HW.HW_Conditional_Operators.For;

import java.util.Scanner;

public class CheckIntNumber {
    public static void main(String[] args) {
        checkIntNumber();
    }

    public static void checkIntNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        int number = scanner.nextInt();

        boolean isPrime = true; // мы думаем что изначально число (isPrime) простое
        // проверяем меньше ли число или = на 1
        if (number <= 1) {
            //если условие срабатывает то присваиваем false
            isPrime = false;
        } else {
            // i в итерации проверяем делимость на number
            // начиная с 2
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }


    }
}
