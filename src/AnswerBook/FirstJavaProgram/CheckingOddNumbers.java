package AnswerBook.FirstJavaProgram;

public class CheckingOddNumbers {
    public static void main(String[] args) {
        CheckingOddNumbers checkingOddNumbers = new CheckingOddNumbers();
        System.out.println(checkingOddNumbers.isOdd(3));
    }

    public boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
