package AnswerBook.StaticFinal;

public final class ClassNoExtend {
    public static void main(String[] args) {
        System.out.println(sum(2,2));
        System.out.println(subtract(1,5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
