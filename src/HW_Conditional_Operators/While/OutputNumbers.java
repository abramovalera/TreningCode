package HW_Conditional_Operators.While;

import java.util.Scanner;

public class OutputNumbers {
    public static void main(String[] args) {
        outputNumbers();
    }

    public static void outputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Go: ");
        int number = scanner.nextInt();

        int i = 1;
        while (i <= number) {
            if (i % 2 == 0)
                System.out.println("Четное число: " + i);
            i++;
        }
    }
}
