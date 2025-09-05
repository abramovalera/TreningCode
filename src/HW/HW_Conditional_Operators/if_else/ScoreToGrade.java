package HW.HW_Conditional_Operators.if_else;

import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        scoreToGrade();
    }

    public static void scoreToGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите число: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                number = 1;
                System.out.println("Неудовлетворительно");
                break;
            case 2:
                number = 2;
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                number = 3;
                System.out.println("Удовлетворительно");
                break;
            case 4:
                number = 4;
                System.out.println("Хорошо");
                break;
            case 5:
                number = 5;
                System.out.println("Отлично");
                break;
        }
    }
}
