package Treningcode.Algoritm;

//Проверить, является ли строка палиндромом (одинаково читается в обе стороны)
public class task2 {
    public static void main(String[] args) {
        System.out.println(isPolindrome(" Abba   "));
    }

    public static boolean isPolindrome(String a) {
        String clear = a.replaceAll("\\s+", "").toLowerCase();

        String revers = new StringBuilder(clear).reverse().toString();

        return clear.equals(revers);

    }
}
