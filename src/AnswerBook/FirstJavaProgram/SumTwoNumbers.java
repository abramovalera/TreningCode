package AnswerBook.FirstJavaProgram;

public class SumTwoNumbers {
    public static void main(String[] args) {
        SumTwoNumbers calculator = new SumTwoNumbers();
        int resilt = calculator.add(2,3);
        System.out.println(resilt);
    }

    public  int add(int a, int b) {
        return a + b;
    }
}
