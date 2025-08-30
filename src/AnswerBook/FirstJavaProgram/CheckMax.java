package AnswerBook.FirstJavaProgram;

public class CheckMax {
    public static void main(String[] args) {
        CheckMax checkDivisionZero = new CheckMax();
        checkDivisionZero.findMax(234, 0);
    }

    public void findMax(int a, int b) {
        int max = Math.max(a, b);
        if (b == 0) {
            System.out.println("Ошибка! Делить на 0 нельзя!");
        } else {
            System.out.println(max);
        }
    }
}
