package HW_Collection.TreeSet;

import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        for(Integer i : numbers){
            System.out.println(i);
        }
    }
}
