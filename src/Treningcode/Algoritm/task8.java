package Treningcode.Algoritm;

//Найти второй по величине элемент в массиве.
public class task8 {
    public static void main(String[] args) {
        System.out.println(method(new int[]{1, 5, 16, 5, 9, 15, 1, 0}));
    }

    public static int method(int[] arr) {
        int max1 = 0;
        int max2 = 0;

        for (int i : arr) {
            if (i > max1) {
                max2 = max1; // старый максимум сдвигаем на второе место
                max1 = i; // обновляем первый максимум
            } else if (i > max2 && i != max1) {
                max2 = i;
            }
        }
        return max2;
    }
}

