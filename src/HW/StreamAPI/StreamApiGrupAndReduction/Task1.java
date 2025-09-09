package HW.StreamAPI.StreamApiGrupAndReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<String> string = Arrays.asList("Вика", "Банан", "Арбуз", "Вова");
        Map<Character, List<String>> stringSort = string.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0)));

        System.out.println(stringSort);

    }
}
