package HW_Conditional_Operators.beack_countine;

import java.util.Scanner;

public class SumNumbersFirstNegativeWhileTrue {
    public static void main(String[] args) {
        sumNumbersFirstNegativeWhileTrue();
    }
    public static void sumNumbersFirstNegativeWhileTrue(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Ввод:");
            int a = scanner.nextInt();

            if (a < 0) {
                break;
            }
            sum += a;// прибавляем к сумме // sum = sum + a //
            System.out.println("Сумма:" + sum);
        }







    }
}
