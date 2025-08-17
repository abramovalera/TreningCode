package HW_Conditional_Operators.do_while;
//Подсчёт количества цифр в числе: считай число. Объяви счётчик count = 0.
// Используй do-while, деля число на 10 в каждой итерации (n = n / 10) и увеличивая счётчик.
// Повторяй, пока число не станет 0. Обрабатывай 0 отдельно, так как у него одна цифра.

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
countNumber();
    }

    public static void countNumber() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n;


        do {
            System.out.println("Ввод: ");
            n = scanner.nextInt(); //1
            n = n / 10; // 0.1

        }while (n !=0);

        System.out.println(count);

        // не понимаю это задание от слова вообще.


    }
}
