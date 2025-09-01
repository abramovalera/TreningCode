package AnswerBook.FirstJavaProgram;

public class SwapingTwoNumbers {
    public static void main(String[] args) {
        swap(2, 4);
    }

    static void swap(int a, int b) {
        System.out.println("До: " + a + " и " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("После: " + a + " и " + b);
    }
}
