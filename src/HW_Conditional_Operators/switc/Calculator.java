package HW_Conditional_Operators.switc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите оператора (+, -, *, /)");
        String operator = scanner.next();

        System.out.print("Второе число: ");
        double b = scanner.nextDouble();



        double result;
        switch (operator) {
            case "+":
                result = a + b;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = a - b;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = a * b;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (b == 0){
                    System.out.println("Делить на 0 нельзя!!!");
                    break;
                }
                result = a / b;
                System.out.println("Результат: " + result);
                break;
        }


    }
}
