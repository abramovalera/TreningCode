package HW_Collection.ArrayList.Task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> maxNumbers = new ArrayList<>();

        maxNumbers.add(1);
        maxNumbers.add(77777777);
        maxNumbers.add(-24);
        maxNumbers.add(34634);
        maxNumbers.add(0);

        int max = Integer.MIN_VALUE;

        for (Integer i : maxNumbers) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
