package Practice.practice_6.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGender {
    public static void main(String[] args) {
        // список строк с именами и полом "Name:Gender"
        List<String> names = Arrays.asList("John:M", "Sarah:F", "Mike:M");

        Map<String, List<String>> groupByGender = names.stream()
                .collect(Collectors.groupingBy(
                        name -> name.split(":")[1],                       // ключ = пол
                        Collectors.mapping(name -> name.split(":")[0],     // значение = имя
                                Collectors.toList())
                ));

        System.out.println(groupByGender);
    }
}
