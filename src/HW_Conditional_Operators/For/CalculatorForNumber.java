package HW_Conditional_Operators.For;

import java.util.Scanner;

public class CalculatorForNumber {
    public static void main(String[] args) {
        calculatorForNumber();
    }

    public static void calculatorForNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            //  ввели 1 --- 1*1 = 2
            int result = i * number;
            System.out.println(number + " * " + i + " = " + result);
        }

    }
}