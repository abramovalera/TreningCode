package HW.HW_Collection.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> telBook = new HashMap<>();

        telBook.put("Вася", 19);
        telBook.put("Петя", 20);
        telBook.put("Оля", 55);
        telBook.put("Кира", 4);
        telBook.put("Николай", 100);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String i = scanner.nextLine();

        if(telBook.containsKey(i)){
            System.out.println("Такой контакт есть! " + "Ее возраст: " + telBook.get(i));
        }else {
            System.out.println("Браток ты ошибся");
        }
        scanner.close();
    }
}
