package AnswerBook.FirstJavaProgram;

public class CheckMin {
    public static void main(String[] args) {
        CheckMin checkMin = new CheckMin();
        checkMin.findMin(-432, 4);
    }

    public void findMin(int a, int b) {
        int min = Math.min(a, b);
        System.out.println(min);
    }
}
