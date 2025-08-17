package HW_Conditional_Operators.do_while;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        countNumber();
    }

    public static void countNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            do {
                n = n / 10;
                count++;
            } while (n != 0);
        }

        System.out.println("Количество цифр: " + count);
        scanner.close();
    }
}
