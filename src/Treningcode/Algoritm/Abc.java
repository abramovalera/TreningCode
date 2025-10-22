package Treningcode.Algoritm;

import java.util.HashSet;
import java.util.Set;

//проверить что в строке нету повторяющегося символа
public class Abc {
    public static void main(String[] args) {
        System.out.println(method("a  s"));


    }

    public static boolean method(String str) {
        char[] chars = str.toCharArray();

        Set<Character> set = new HashSet<>();
        for (char i : chars) {
            if (!set.add(i)) return false;
        }
        return true;
    }
}
