package Treningcode.Algoritm;

//Посчитать сумму всех чисел в массиве
public class task3 {
    public static void main(String[] args) {
        System.out.println(method(new int[]{1, 2, 3}));
    }

    public static int method(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}



