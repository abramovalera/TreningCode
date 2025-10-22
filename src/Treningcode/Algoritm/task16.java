package Treningcode.Algoritm;

import java.util.ArrayList;
import java.util.List;

//Удалить дубликаты из List<Integer>.
public class task16 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(-134);
        list.add(-134);
        list.add(-6574);

        System.out.println(method(list));
    }

    public static List<Integer> method(List<Integer> list) {
        return list.stream().distinct().toList();

    }
}
