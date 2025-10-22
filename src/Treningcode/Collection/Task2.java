package Treningcode.Collection;

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();

        city.add("Moscow");
        city.add("Paris");
        city.add("Moscow");
        city.add("Bali");
        city.add("Mali");

        for (String citys : city) {
            System.out.println(citys);
        }

        if (city.contains("Mali")) {
            System.out.println("Такой город есть!");
        } else {
            System.out.println("Нету такого города(");
        }

        city.remove("Mali");
        System.out.println("_____");

        for (String citys : city) {
            System.out.println(citys);
        }


    }
}
