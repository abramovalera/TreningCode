package Practice.practice_6.streamApi;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // создать список целых чисел, далее отфильтровать все четные числа и суммировать их
        // Промежуточная операция: фильтрация по четности
        // Терминальная операция: суммирование

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

       int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println(sum);
    }
}
