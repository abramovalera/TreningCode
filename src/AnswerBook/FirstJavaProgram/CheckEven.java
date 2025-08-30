package AnswerBook.FirstJavaProgram;

public class CheckEven {
    public static void main(String[] args) {
        CheckEven checkEven = new CheckEven();
        System.out.println(checkEven.isEven(3));
    }

    public boolean isEven(int n) {
       return n % 2 == 0;

    }
}
