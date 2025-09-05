package HW.HW_Collection.ArrayList.Task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integersNumbers = new ArrayList<>();

        integersNumbers.add(1);
        integersNumbers.add(5);
        integersNumbers.add(10);

        int sum = 0;

        for (Integer i : integersNumbers) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
