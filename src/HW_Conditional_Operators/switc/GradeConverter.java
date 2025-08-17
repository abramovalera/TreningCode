package HW_Conditional_Operators.switc;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        gradeConverter();
    }

    public static void gradeConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 100) {
            System.out.println("Ты слишком крут для оценок =)");
        } else if (number < 0) {
            System.out.println("Неверное число!");
        } else if (number >= 90) {
            System.out.println("А");
        } else if (number >= 80) {
            System.out.println("B");
        } else if (number >= 70) {
            System.out.println("C");
        } else if (number >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
