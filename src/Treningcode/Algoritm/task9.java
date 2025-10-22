package Treningcode.Algoritm;

import java.util.Arrays;
/**
 * Строки:
 *    a = "кот"
 *    b = "ток"
 * Преобразование в массивы:
 *    ca = ['к', 'о', 'т']
 *    cb = ['т', 'о', 'к']
 * Сортировка:
 *    ca = ['к', 'о', 'т']
 *    cb = ['к', 'о', 'т']
 * Сравнение:
 *    ['к', 'о', 'т'] == ['к', 'о', 'т'] → true
 */
//Проверить, являются ли две строки анаграммами друг друга
public class task9 {
    public static void main(String[] args) {
        System.out.println(isMethod("кот", "ток"));
    }

    public static boolean isMethod(String a, String b){
        char[] ca = a.toCharArray(); // Строка "кот" превращается в массив ['к', 'о', 'т']
        char[] cb = b.toCharArray(); // Строка "ток" превращается в массив ['т', 'о', 'к']
        Arrays.sort(ca);
        Arrays.sort(cb);

        return Arrays.equals(ca, cb);
     }
}
