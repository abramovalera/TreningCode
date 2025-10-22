package AnswerBook.Cycles;

public class task6 {
    public static void main(String[] args) {
        System.out.println(task6.method(4, 6, 9));
    }

    public static int method(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
