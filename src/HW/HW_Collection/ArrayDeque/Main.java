package HW.HW_Collection.ArrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(16);

        for(Integer i : numbers){
            System.out.println(i);
        }
    }
}
