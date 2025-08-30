package HW_Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, Integer> telBook = new HashMap<>();

        telBook.put("Вася", 19);
        telBook.put("Петя", 20);
        telBook.put("Оля", 55);
        telBook.put("Кира", 4);
        telBook.put("Николай", 13);
        printUnderage(telBook);

    }
    public static void printUnderage(Map<String, Integer> people){
        for(Map.Entry<String, Integer> entry : people.entrySet())
            if (entry.getValue() < 18){
                System.out.println(entry.getKey() + ": "  + entry.getValue());
            }
    }
}
