package HW_Collection.ArrayList.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> line = new ArrayList<>();
        line.add("пупупу");
        line.add("Нет");
        line.add("Да уж");
        line.add("ОЧЕНЬ БОЛЬШОЕ СЛОВОВ КОТОРОЕНАДОВЫВЕСТИ");

        String aString = "";

        for (String i : line) {
            if (i.length() > aString.length()) {
                aString = i;
            }
        }
        System.out.println(aString);
    }
}
