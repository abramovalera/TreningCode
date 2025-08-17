package HW_Conditional_Operators.if_else;

import java.util.Scanner;

public class CheckForParity {
    public static void main(String[] args) {
        checkForParity();
    }

    public static void checkForParity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();


        if ( a % 2 == 0) {
            System.out.print("Четное!");
        } else {
            System.out.print("Не четное!");
        }
    }
}
