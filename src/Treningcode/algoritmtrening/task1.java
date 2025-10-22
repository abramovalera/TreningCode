package Treningcode.algoritmtrening;

//Проверить, является ли строка палиндромом (одинаково читается в обе стороны).
public class task1 {
    public static void main(String[] args) {
        System.out.println(method(" Aba"));
    }

    public static boolean method(String str){

        String a = str.trim().toLowerCase();
        String revers = new StringBuilder(a).reverse().toString();

        return a.equals(revers);
    }
}
