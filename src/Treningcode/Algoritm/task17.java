package Treningcode.Algoritm;
//Оставить в списке только нечетные числа

import java.util.ArrayList;
import java.util.List;

public class task17 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2); // 2
        list.add(3);
        list.add(4); // 4
        list.add(5);

        System.out.println(method(list));
    }
    public static List<Integer> method(List<Integer> list) {
      return list.stream().filter(x-> x % 2 != 0).toList();
    }
}
