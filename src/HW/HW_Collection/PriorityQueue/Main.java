package HW.HW_Collection.PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(33);

        //пока коллекция не пустая, выполняй цикл
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }


    }
}
