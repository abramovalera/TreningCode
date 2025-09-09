package HW.StreamAPI.AggregationOperation;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Банан", "Арбуз", "Дыня", "Брикет");
        String listB = list.stream()
                .filter(x -> x.startsWith("Б"))
                .findFirst()
                .orElse("Не найдено");

        System.out.println(listB);
    }
}
