package HW.StreamAPI.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,6);
        List<Integer> numbersSquare = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(numbersSquare);



    }
}
