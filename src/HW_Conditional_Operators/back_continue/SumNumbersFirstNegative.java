package HW_Conditional_Operators.back_continue;

import java.util.Scanner;

public class SumNumbersFirstNegative {
    public static void main(String[] args) {
        sumNumbersFirstNegative();
    }
    public static void sumNumbersFirstNegative() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a;

        do {
            System.out.print("Ввод: ");
            a = scanner.nextInt();
            if (a < 0) {
                break;
            }
            sum = a + sum;
            System.out.println("Сумма:" + sum);
        } while (a >= 0);
    }
}
