package HW.StreamAPI.AggregationOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
       Integer numberMax = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);

        System.out.println(numberMax);
    }
}
