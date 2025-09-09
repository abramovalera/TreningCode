package HW.StreamAPI.AggregationOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, -5);
        Integer numberMin = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);

        System.out.println(numberMin);
    }
}
