package HW_Conditional_Operators.back_continue;

import java.util.Scanner;

public class EnteringLinesBeforStop {
    public static void main(String[] args) {
        enteringLinesBeforStop();
    }

    public static void enteringLinesBeforStop() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите слово секретное: ");
            String a = scanner.nextLine();
            if (a.equals("stop")) {
                break;
            }
            System.out.println("НЕТ!");
        }
        System.out.println("Да!");
    }
}
