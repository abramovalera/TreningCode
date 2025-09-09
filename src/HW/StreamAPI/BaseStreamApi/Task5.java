package HW.StreamAPI.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,3,4,4,5,5);
        List<Integer> numberNoCopy = number.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numberNoCopy);

    }
}
