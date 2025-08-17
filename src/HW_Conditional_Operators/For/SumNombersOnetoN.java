package HW_Conditional_Operators.For;

import java.util.Scanner;

public class SumNombersOnetoN {
    public static void main(String[] args) {
        sumNombersOnetoN();
    }

    public static void sumNombersOnetoN() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма каждого числа " + n + " будет " + sum);
    }
}
