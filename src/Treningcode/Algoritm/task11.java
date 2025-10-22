package Treningcode.Algoritm;

import java.util.ArrayList;
import java.util.List;

//Посчитать сумму всех чисел в List<Integer>
public class task11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(method(list));
    }

    public static int method(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

}
