package HW.StreamAPI.BaseStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Яблоко", "Сок","Арбуз");
        List<String>  listFilter = list.stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());

        System.out.println(listFilter);


    }
}
