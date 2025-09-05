package HW.HW_Collection.LinkedList;

import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);

        int sum = 0;
        for (int i : numbers) {
            sum = i + sum;
        }
        System.out.println(sum);
    }
}
