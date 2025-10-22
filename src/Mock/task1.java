package Mock;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        System.out.println(method(new int[]{1,2,3,3})); // 1
        System.out.println(method(new int[]{124, 43, 1,124,1,43,54})); // 54
        System.out.println(method(new int[]{1,1,2,2,4,5,6})); // 4
        System.out.println(method(new int[]{1})); // 1
        System.out.println(method(new int[]{1,2,3,4,5,6,7,8,9,10,11})); // null
        System.out.println(method(new int[]{})); // null
        System.out.println(method(new int[]{1,2,3,-3})); // -3
    }

    public static Integer method(int[] arr) {
        if (arr == null || arr.length == 0) return null; // пустой массив

        Map<Integer, Integer> countMap = new LinkedHashMap<>(); // сохраняем порядок

        // Подсчёт встречаемости каждого числа
        for (int num : arr) { // используй arr вместо numbers
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Поиск первого уникального числа
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // возвращаем найденное число
            }
        }

        return null; // если уникальных чисел нет
    }
}
