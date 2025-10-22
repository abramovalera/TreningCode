package Treningcode.Algoritm;

import java.util.HashSet;
import java.util.Set;

//Проверить, все ли элементы в массиве уникальны.
public class task12 {
    public static void main(String[] args) {
        System.out.println(isMethod(new int[]{1, 2, 3, 4}));
    }

    public static boolean isMethod(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.add(i)) return false;
        }
        return true;
    }
}
