package HW_Collection.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
