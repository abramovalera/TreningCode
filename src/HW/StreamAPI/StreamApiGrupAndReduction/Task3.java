package HW.StreamAPI.StreamApiGrupAndReduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 7);
        Double numbersAvg = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(numbersAvg);
    }
}
