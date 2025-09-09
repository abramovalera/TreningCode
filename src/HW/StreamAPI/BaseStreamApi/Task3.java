package HW.StreamAPI.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Привет", "Ок");
        List<Integer> listFilter = list.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(listFilter);

    }
}
