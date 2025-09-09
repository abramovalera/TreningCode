package HW.StreamAPI.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,10);
        List<Integer> numberFilter = number.stream()
                .filter(x -> x % 5 ==0)
                .collect(Collectors.toList());

        System.out.println(numberFilter);
    }
}
