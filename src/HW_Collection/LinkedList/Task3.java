package HW_Collection.LinkedList;

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<String> task3 = new LinkedList<>();
        task3.add("Привет");
        task3.add("Как");
        task3.add("Кого");
        task3.add("Пока");

        String firstElement = task3.getFirst();
        String lastElement = task3.getLast();


        System.out.println("Первый элемент: " + firstElement);
        System.out.println("Крайний элемент: " + lastElement);

    }
}
