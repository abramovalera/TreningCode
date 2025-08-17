package practice_3.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWileTaskSolver {
    public static void main(String[] args) {
        findNumber(10);

    }
    public static void findNumber(int bound){
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(bound);
        int number;
        do {
            System.out.println("Угадай число: ");
             number = scanner.nextInt();
        } while (number!= random);

        System.out.println("Верно!");

    }
}
