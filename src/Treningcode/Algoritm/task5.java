package Treningcode.Algoritm;

//Определить, является ли число простым (делится только на 1 и себя).
public class task5 {
    public static void main(String[] args) {

    }

    public boolean isMethod(int a) {
        if (a <= 1) return false;
        for (int i = 2; i * i <= a; i++)
            if (a % i == 0) return false;
        return true;
    }
}
