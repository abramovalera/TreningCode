package HW.HW_Conditional_Operators.do_while;

import java.util.Scanner;

public class GiveMeMyPassword {
    public static void main(String[] args) {
        giveMeMyPassword();
    }

    public static void giveMeMyPassword() {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "123";
        String number;

        do {
            System.out.print("Пароль: ");
            number = scanner.nextLine();

            //.equals() сравнивает содержимое строк, а не их ссылки.
            // выводим сообщение если цикл повторяется
            if (!number.equals(correctPassword))

                System.out.println("Неверно, введите еще раз!");

        } while (!number.equals(correctPassword));
        System.out.println("ОК");


    }
}
