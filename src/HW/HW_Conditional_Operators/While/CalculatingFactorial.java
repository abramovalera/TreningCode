package HW.HW_Conditional_Operators.While;

import java.util.Scanner;

//Вычисление факториала с помощью while: считай число.
// Объяви переменную result = 1 и счётчик i = 1. Пока i <= number,
// умножай result на i и увеличивай i. В конце выведи result.
public class CalculatingFactorial {
    public static void main(String[] args) {
        calculatingFactorial();
    }

    public static void calculatingFactorial() {

        // вводим значение
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        int number = scanner.nextInt(); // ввели

        int result = 1; // начальоне значение факториала
        int i = 1; // счтчик

        while (i <= number) {
            result = result * i;
            i++;
        }
        System.out.println("Факториал числа ---> "+ number + " ---> " + result);
    }
}
