package HW_Collection.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

        numbers.put("Кристина", 3);
        numbers.put("Вася", 43);
        numbers.put("Оля", 41);
        numbers.put("Надя", 31);
        numbers.put("Петя", 4);

        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
