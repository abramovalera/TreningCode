package HW_Collection.LinkedList;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {

        LinkedList<String> fiveString = new LinkedList<>();

        fiveString.add("Привет");
        fiveString.add("Меня");
        fiveString.add("Зовут");
        fiveString.add("Валера");
        fiveString.add("=)");

        for (String i : fiveString) {
            System.out.println(i);
        }
    }
}
