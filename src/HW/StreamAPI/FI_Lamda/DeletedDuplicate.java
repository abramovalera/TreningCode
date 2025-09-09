package HW.StreamAPI.FI_Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeletedDuplicate {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali","Bac","Cebas","Ali");
        List<String> filterNames = names.stream() // преобразуем в поток
                .distinct() // убираем дубликаты
                .collect(Collectors.toList()); // собирает обратно в список

        System.out.println(filterNames);
    }
}
