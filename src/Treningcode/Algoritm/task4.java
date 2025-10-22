package Treningcode.Algoritm;

//Найти наибольшее число в массиве
public class task4 {
    public static void main(String[] args) {
        System.out.println(method(new int[]{1, 2, 7, 43, 1, 0, -548}));
        System.out.println(method(new int[]{0}));
        System.out.println(method(new int[]{}));
        System.out.println(method(new int[]{-432}));
    }

    public static int method(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
