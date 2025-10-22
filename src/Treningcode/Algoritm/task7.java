package Treningcode.Algoritm;

//Посчитать количество гласных букв в строке. aeiouаеёиоуыэюя
public class task7 {
    public static void main(String[] args) {
        System.out.println(method("аааабббби"));
    }

    public static int method(String s) {
        int count = 0;
        for (char i : s.toLowerCase().toCharArray()) {
            if ("aeiouаеёиоуыэюя".indexOf(i) >= 0) count++;
        }
        return count;
    }
}
