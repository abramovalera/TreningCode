package Treningcode.Algoritm;
//Посчитать количество слов в строке

public class task10 {
    public static void main(String[] args) {
        System.out.println(method("Привет, как дела?"));
    }

    public static int method(String a) {
        if (a == null || a.trim().isEmpty ()) return 0;
        if(a.length() >= 100 || a.length() <=0) return 0;
        return a.trim().split("\\s+").length;
    }
}
