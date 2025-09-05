package AnswerBook.FirstJavaProgram;

public class CheckingDivisionNumberByAnother {
    public static void main(String[] args) {
        System.out.println(isDivision(1, 0));
        System.out.println(isDivision(4, 2));
        System.out.println(isDivision(10, 3));
    }

    static boolean isDivision(int a, int b) {
        if (b != 0) {
            return a % b == 0;
        }
        return false;
    }
}
