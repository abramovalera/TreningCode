package AnswerBook.FirstJavaProgram;

public class RoundingDown {
    public static void main(String[] args) {
        System.out.println(roundDown(6.66));
    }

    static double roundDown(double x) {
        return Math.floor(x);
    }
}
