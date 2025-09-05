package HW.HW_Collection.HashMap;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> telBook = new HashMap<>();

        telBook.put("Вася", 19);
        telBook.put("Петя", 20);
        telBook.put("Оля", 55);
        telBook.put("Кира", 4);
        telBook.put("Николай", 100);

        System.out.println(telBook.entrySet());
    }
}
