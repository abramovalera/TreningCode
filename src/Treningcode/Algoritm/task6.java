package Treningcode.Algoritm;

//Вычислить факториал числа n (n!).
public class task6 {
    public static void main(String[] args) {
        System.out.println(method(3));
    }

    public static int method(int a) {
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
