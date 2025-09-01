package AnswerBook.FirstJavaProgram;

public class RoundingUp {
    public static void main(String[] args) {
        System.out.println(roundUp(6.77));
    }

    static double roundUp(double x) {
        return Math.ceil(x);
    }
}
