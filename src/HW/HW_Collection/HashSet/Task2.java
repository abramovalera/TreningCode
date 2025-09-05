package HW.HW_Collection.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        int numberChek = scanner.nextInt();


        if (numbers.contains(numberChek)) {
            System.out.println("Элемент" + numberChek + "Присутствует");
        }else {
            System.out.println("Такого нет!");
        }
        scanner.close();
    }
}
