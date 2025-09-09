package HW.StreamAPI.AggregationOperation;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        boolean numbers2 = numbers.stream()
                .anyMatch(x -> x % 2 ==0);

        System.out.println("Есть четное число = " + numbers2);
    }
}
