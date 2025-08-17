package HW_Conditional_Operators.beack_countine;

import java.util.Scanner;

public class OutputOnlyPositivNumbers {
    public static void main(String[] args) {
        outputOnlyPositivNumbers();
    }

    public static void outputOnlyPositivNumbers() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ввод:");
            int a = scanner.nextInt();

            if (a < 0) {
                continue;
            }
            System.out.println("Число: " + a);
        }
    }
}
