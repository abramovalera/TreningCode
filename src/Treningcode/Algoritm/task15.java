package Treningcode.Algoritm;

import java.util.ArrayList;
import java.util.List;

//Оставить только строки, начинающиеся с 'A'.
public class task15 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Abr");
        list.add("GA");
        list.add("ar");
        list.add("aA");
        list.add("BaDA");
        System.out.println(method(list));
    }

    public static List<String> method(List<String> list) {
        List<String> listClean = new ArrayList<>();
        for (String i : list) {
            if (i.toLowerCase().startsWith("a")){
                listClean.add(i);
            }
        }
        return listClean;
    }
}
