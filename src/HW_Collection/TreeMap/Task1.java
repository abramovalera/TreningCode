package HW_Collection.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        //Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные
        TreeMap<String, Integer> scores  = new TreeMap<>();

        scores .put("Vasa", 2);
        scores .put("Kola", 1);
        scores .put("Nikita", 5);
        scores .put("Maks", 0);
        scores .put("Oleg", 2);

        for (Map.Entry<String, Integer> entry : scores.entrySet()){
            String name = entry.getKey();
            Integer score = entry.getValue();
            System.out.println(name + " = " + score);
        }
    }
}
