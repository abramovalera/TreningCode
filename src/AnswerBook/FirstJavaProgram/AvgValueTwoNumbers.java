package AnswerBook.FirstJavaProgram;

public class AvgValueTwoNumbers {
    public static void main(String[] args) {
        AvgValueTwoNumbers avg = new AvgValueTwoNumbers();
        System.out.println(avg.avarage(10, 5));
    }

    public double avarage(int a, int b) {
        return (a + b) / 2.0;
    }
}
