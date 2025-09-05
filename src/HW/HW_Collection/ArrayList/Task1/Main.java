package HW.HW_Collection.ArrayList.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Создать ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        //Добавить 5 чисел + одно число в конц

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        // тип - переменная : имя коллекции
        for (Integer element: numbers){
            System.out.println(element);
        }

        //добавили еще один
        numbers.add(6);

        System.out.println("__________________");

        for (Integer element: numbers){
            System.out.println(element);
        }
    }
}
