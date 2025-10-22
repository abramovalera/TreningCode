package AnswerBook.Cycles;

public class task9 {
    public static void main(String[] args) {
        method(3, 7);
    }

    public static void method(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}
