package AnswerBook.FirstJavaProgram;

public class DivisionWithRemainder {
    public static void main(String[] args) {
        DivisionWithRemainder divideNumber = new DivisionWithRemainder();
        double result = divideNumber.divide(10, 3);
        System.out.printf("%.2f%n", result);
    }

    public double divide(int a, int b) {
         return (double) a / b;
    }
}
